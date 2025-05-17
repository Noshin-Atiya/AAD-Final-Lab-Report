package quick_sort;
import java.util.Scanner;

public class q_sort {
	
		public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		public static int partition(int[] arr,int low,int high) {
			int pi = arr[low];
			int i=low+1;
			int j= high ;
			while(i<=j) {
				while(i<=high && arr[i]<=pi) {
					i++;
				}
				while(j>=low && arr[j]>pi) {
					j--;
				}
				if(i<j) {
				swap(arr,i,j);
				}
					
				
			}
			swap(arr,low,j);
			
			return j;
		}
		public static void quickSort(int[] arr, int low,int high) {
			if(low<high) {
				int pi = partition(arr,low,high);
				quickSort(arr, low, pi-1);
				quickSort(arr, pi+1, high);
			}
		}
		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array size: ");
			n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the array elements: ");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("The Original Array list: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			quickSort(arr,0,n-1);
			System.out.println();
			System.out.println("The Sorted Array list: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}

