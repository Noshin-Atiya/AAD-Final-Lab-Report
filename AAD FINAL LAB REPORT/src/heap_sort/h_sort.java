package heap_sort;

import java.util.Scanner;

public class h_sort {
	public static void swap(int a[],int l,int r) {
		int temp=a[l];
		a[l]=a[r];
		a[r]=temp;
	}
	public static void Max_Heap(int a[],int i,int n) {
		int left=2*i+1;
		int right=2*i+2;
		int largest=i;
		if(left<n&&a[left]>a[largest]) {
			largest=left;
		}
		if(right<n&&a[right]>a[largest])
		{
			largest=right;
		}
		if(largest!=i) {
			swap(a,largest,i);
			Max_Heap(a,largest,n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter how many element:");
		n=sc.nextInt();
		int []a=new int[n];
		System.out.print("Enter element: ");
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		for(int i=(n/2)-1;i>=0;i--)
		Max_Heap(a,i,n);
		System.out.print("After Building Heap Tree: ");
		for(int i=0;i<n;i++)System.out.print(a[i]+" ");
		for(int i=n-1;i>=0;i--)
		{
			swap(a,0,i);
			Max_Heap(a, 0, i);
		}
		System.out.println();
		System.out.print("After soting: ");
		for(int i=0;i<n;i++)System.out.print(a[i]+" ");

	}

}