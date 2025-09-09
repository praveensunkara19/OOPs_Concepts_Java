package StrngsLists;

public class exmaple3 {
	public static void main(String[] args) {
		int evensum=0;
		int oddsum = 0;
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				evensum = evensum+arr[i];
			}
			else {
				oddsum = oddsum+arr[i];
			}
		}
		System.out.println("the evensum ="+evensum);	
	System.out.println("the oddsum ="+oddsum);	

	}
}
