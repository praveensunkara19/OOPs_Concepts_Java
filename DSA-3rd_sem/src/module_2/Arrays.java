package module_2;

public class Arrays {
	 static int ar[]=new int[]{3,5,2,6,8,7,1};
	 
	public static void insertion(int pos,int element) {
		
		for(int i=ar.length-1;i>pos;i--) {
			ar[i]=ar[i-1];
		}
		ar[pos]=element;
		
		System.out.println("inserted element:");
		for(int j=0;j<ar.length;j++) {
	         System.out.println(ar[j]);
	         }
	}
	public static void deletion(int pos) {
		int temp[] = new int[ar.length-1];
		for(int i =0,k=0;i<ar.length;i++) {
			if(i==pos)
				continue;
			temp[k++]=ar[i];
		}
		ar=temp;
		System.out.println("after deletion array is:");
		for(int j=0;j<temp.length;j++) {
			System.out.println(temp[j]);
		}
	}
	
	public static void sorting() {
		int pass=0;
		for (int j=0;j<ar.length-1;j++) {
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
				pass=1;
			}
		}
		if(pass==1);
		System.out.println("the sorted arred array is;");
		for(int j:ar) {
			System.out.println(ar[j]);
		}
		sorting();
	}
	
    public static void main(String[] args) {
    	insertion(2,4);
    	deletion(3);
    	
    	sorting();
    	
    }
}