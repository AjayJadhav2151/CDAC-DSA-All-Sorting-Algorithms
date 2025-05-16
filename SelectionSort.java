package sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int [] arr= {12,5,72,-1,36};
		
		int small=0;
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("After pass::"+i);
			small=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[small]) {
					{
						small=j;
					}
				}
			}
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}			
			System.out.println();
			
			if(arr[i]!=arr[small]) {
				int temp = arr[i];
				arr[i] = arr[small];
				arr[small] = temp;
			}
		}
		System.out.println("Final Sorted ::");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
	}
}
}
