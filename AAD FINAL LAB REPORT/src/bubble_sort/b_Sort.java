package bubble_sort;

import java.util.Scanner;

public class b_Sort {
	public static void main(String[] args){
		
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
		int pass=n-1;
		for(int i=pass;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The Sorted Array list: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
				
	}

}
