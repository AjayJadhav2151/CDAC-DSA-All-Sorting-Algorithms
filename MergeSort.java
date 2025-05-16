//package sorting;
//
//public class MergeSort {
//
//	public static void main(String[] args) {
//		int []arr1 = {-3,5,11,96};
//		int []arr2 = {15,17,23,52};
//		
//		int len1 = arr1.length;
//		int len2 = arr2.length;
//		
//		int[] arr3 = new int[len1+len2];
//		
//		int i=0,j=0,k=0;
//		while(i<len1 && j<len2) {
//			if(arr1[i]<arr2[j]) {
//				arr3[k++] = arr1[i++];
//			} else {
//				arr3[k++] = arr2[j++];
//			}
//		}
//		while(i<len1) {
//			arr3[k++] = arr1[i++];
//		}
//		 while(j<len2) {
//			 arr3[k++] = arr2[j++];
//		 }
//		 
//		 for(i=0;i<arr3.length;i++) {
//			 System.out.println(arr3[i]);
//		 }
//	}
//}

private static void merge(int[] a, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) {
        L[i] = a[left + i];
    }
    for (int j = 0; j < n2; j++) {
        R[j] = a[mid + 1 + j];
    }

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            a[k++] = L[i++];
        } else {
            a[k++] = R[j++];
        }
    }

    while (i < n1) {
        a[k++] = L[i++];
    }

    while (j < n2) {
        a[k++] = R[j++];
    }
}

public static void mergeSort(int[] a, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }
}

