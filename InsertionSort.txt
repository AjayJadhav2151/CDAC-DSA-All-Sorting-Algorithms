package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void insertion(int arr[], int n) {
		int small=0;
		for(int i=1;i<n;i++) {
			small = arr[i];
			for(int j=i-1;j>=0 && arr[j]>small;j--) {
				arr[j+1]=arr[j];
				arr[j]=small;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		System.out.println("Enter Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Original array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		insertion(arr,n);
		System.out.println();
		System.out.println("Sorted array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
