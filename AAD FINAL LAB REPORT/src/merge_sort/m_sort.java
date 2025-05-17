package merge_sort;
import java.util.Scanner;

public class m_sort {
	
		public static void merge(int[] arr,int low,int mid, int high) {
			int s1=mid-low+1;
			int s2=high-mid;
			int[] arr1 = new int[s1];
			int[] arr2 = new int[s2];
			for(int i=0;i<s1;i++) {
				arr1[i]=arr[low+i];
			}
			for(int j=0;j<s2;j++) {
				arr2[j] = arr[mid+1+j];
			}
			int k =low,i=0,j=0;
			while(i<s1 && j<s2) {
				if(arr1[i]<=arr2[j]) {
					arr[k]=arr1[i];
					i++;
					
				}
				else {
					arr[k]=arr2[j];
					j++;
					
				}
				k++;
			}
			while(i<s1) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			while(j<s2) {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		public static void mergeSort(int[] arr, int low, int high) {
			if(low<high) {
				int mid = low+(high-low)/2;
				mergeSort(arr,low,mid);
				mergeSort(arr,mid+1,high);
				merge(arr,low,mid,high);
				
			}
			
		}
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the array size: ");
			n = sc.nextInt();
			int[] arr = new int[n];
			System.out.print("Enter the array elements: ");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("The Original array list: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			mergeSort(arr,0,n-1);
			System.out.println();
			System.out.print("The Sorted array list: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}

	}


