package interThreadCommunication;

import java.lang.*;
import java.util.*;

class photoFrame {
	int id;
	String material;
	String size;
	String texture;
	String colour;

	public photoFrame() {
		super();
	}

	public photoFrame(int id, String material, String size, String texture, String colour) {
		super();
		this.id = id;
		this.material = material;
		this.size = size;
		this.texture = texture;
		this.colour = colour;
	}
}

class maintainPhotoFrame {
	Map<String, List<photoFrame>> availableFrames = new HashMap<>();

	public boolean isAvailable(String type) {
		synchronized (availableFrames) {
			if (!availableFrames.isEmpty() && availableFrames.containsKey(type)) {
				System.out.println(Thread.currentThread() + ":this photo frame is avalable in stock");
				return true;
			}
			System.out.println(Thread.currentThread() + ":this photo frame is out of stock");
			return false;
		}
	}

	public void buyStock(String type) {
		synchronized (availableFrames) {
			if (!availableFrames.isEmpty() && availableFrames.containsKey(type)) {

				List<photoFrame> photoFrameList = availableFrames.remove(type);
				photoFrame photoF = photoFrameList.remove(0);
				availableFrames.put(type, photoFrameList);
				System.out.println(Thread.currentThread() + ":photo Frame:" + photoF.id + ":will be "
						+ "deliver to the given address");
			} else {
				System.out.println(Thread.currentThread() + ":thid photo frame is out of stock");
			}
		}
	}

	public void updateAvailability(String type) {
		synchronized (availableFrames) {
			while (availableFrames.isEmpty() && !availableFrames.containsKey(type)) {
				try {
					availableFrames.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread() + ":updated to the buyer the photo frame is available in stock");
		}
	}

	public void updateAvailabilityOnUI(String type) {
		synchronized (availableFrames) {
			while (availableFrames.isEmpty() && !availableFrames.containsKey(type)) {
				try {
					System.out.println(Thread.currentThread() + ":this photo frame is out of stock,wating for "
							+ "stock update notification.");
					availableFrames.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread() + ":u[date UI: thid photo is now available in stock");
		}
	}

	public void putstock(photoFrame photoF) {
		synchronized (availableFrames) {
			String type = "c" + photoF.colour + "-t" + photoF.texture;
			if (availableFrames.containsKey(type)) {
				List<photoFrame> photoFrameList = availableFrames.get(type);
				photoFrameList.add(photoF);
				availableFrames.put(type, photoFrameList);
			} else {
				List<photoFrame> photoFrameList = new ArrayList<>();
				photoFrameList.add(photoF);
				availableFrames.put(type, photoFrameList);
			}
			availableFrames.notifyAll();
			System.out.println(Thread.currentThread() + ":added the stock,now"
					+ "photo frame is available in stock,sending notification to all");
		}
	}
}

public class interThreadCoummunication {

	public static void main(String[] args) {
		maintainPhotoFrame maintainPhotoF = new maintainPhotoFrame();
		Thread UIThread = new Thread(new Runnable() {
			public void run() {
				String type = "cBrown-tCrack";
				maintainPhotoF.updateAvailabilityOnUI(type);
			}
		}, "UIThread");
		UIThread.start();

		Thread buyerThread = new Thread(new Runnable() {
			public void run() {
				String type = "cBrown-tCrack";
				if (maintainPhotoF.isAvailable(type)) {
					maintainPhotoF.buyStock(type);

				} else {
					maintainPhotoF.updateAvailability(type);
				}
			}
		}, "BuyerThread");
		buyerThread.start();

		Thread sellerThread = new Thread(new Runnable() {
			public void run() {
				String type = "c-Brown-tCrack";
				photoFrame photoF = new photoFrame(1, "wodden", "4x6", "crack", "brown");
				maintainPhotoF.putstock(photoF);
			}
		}, "SellerThread");
		sellerThread.start();
	}
}