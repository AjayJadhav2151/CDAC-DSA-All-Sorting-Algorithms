package sorting;

public class BubbleSort {
		
	public static void main(String[] args) {
		int []arr = {25,8,-1,12,3};
		int swapcount=0;
		int passcount=0;
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("After pass::"+(i+1));
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapcount++;
				}
			}
			passcount++;
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}			
			System.out.println();
		}
		System.out.println("Final Sorted ::");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Total number of swapping: "+swapcount);
		System.out.println("Total number of passes: "+passcount);
	}

}
