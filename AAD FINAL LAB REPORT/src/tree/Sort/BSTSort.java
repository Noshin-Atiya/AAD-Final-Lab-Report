package tree.Sort;

import java.util.Scanner;

public class BSTSort {
	public static BSTNode create(int data) {
		BSTNode root=new BSTNode();
		root.data=data;
		root.left=null;
		root.right=null;
		return root;
	}
	public static BSTNode Insert (BSTNode root,int data) {
		if(root==null)return create(data);
		if(data<root.data)
			root.left=Insert(root.left,data);
		else if(data>root.data)
			root.right=Insert(root.right,data);
		return root;
		
	}
	public static void In_Order(BSTNode root) {
		if(root==null)return;
		In_Order(root.left);
		System.out.print(root.data+" ");
		In_Order(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many node:");
		int n=sc.nextInt();
		BSTNode root=null;
		System.out.print("Enter node value: ");
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			root=Insert(root,a);
		}
		System.out.println("After sorting the tree:");
		In_Order(root);

	}

}