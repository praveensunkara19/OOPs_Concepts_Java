package class2;

class cricket{
	String name;
	int runs;
	cricket(String str,int score){
		name = str;
		runs = score;
	}
	public void show() {
		System.out.println("playerName:"+name+"\t"+"runsScored:"+runs);
		System.out.println();
	}
}
public class strings {
	public static void main(String[] args) {
		cricket[ ] arr = new cricket[5];
		arr[0] = new cricket("dhoni", 5340) ;
		arr[1] = new cricket("kohli", 9000);
		arr[2] = new cricket("rohit", 6500);
		arr[3] = new cricket("jadaja", 4000);
		arr[4] = new cricket("abd", 9000);
		      
		System.out.println("no.of runs by a player in index 0:");
		arr[0].show();
		System.out.println("no.pf runs by a player in inde1:");
		arr[1].show();
		System.out.println("no.of runs by a player in index of2:");
		arr[2].show();
		System.out.println("no.of runs by a player in index of3:");
		arr[3].show();
		System.out.println("no.of runs by a player in index of4:");
		arr[4].show();
}	
	
}