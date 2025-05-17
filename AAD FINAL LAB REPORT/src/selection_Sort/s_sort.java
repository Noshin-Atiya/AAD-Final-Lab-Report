package selection_Sort;
import java.util.Scanner;

public class s_sort {
	
		
		public static void main(String[] args) {
			int n;
			System.out.println("enter the array size: ");
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			int[] arr = new int[n];
			System.out.println("enter the array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("befor sorting: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<n;i++) {
				int min =i;
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[min]) {
						min = j;
					}
				}
				swap(arr,i,min);
				
			}
			System.out.println();
			System.out.println("after sorting: ");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			
			
		}

		private static void swap(int[] arr, int i, int min) {
			// TODO Auto-generated method stub
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		
	}

