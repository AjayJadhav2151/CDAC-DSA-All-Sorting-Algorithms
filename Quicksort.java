package sorting;

import java.util.Arrays;

public class Quicksort {

	public static int partition(int []arr,int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		return i;
	}
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public static void main(String args[]) {
		int arr[]= {11,-1,3,22,54,-2};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}


}
