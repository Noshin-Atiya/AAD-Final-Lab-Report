package Huffman.coding.problem;


import java.util.PriorityQueue;

public class HCPmain {
	static int count = 0;  // ✅ Keep only this one

	public static void main(String[] args) {
		int n = 6;
		char[]c= {'a','c','e','m','u','z'};
		int[]data = {100,53,133,60,44,8};

		PriorityQueue<huffmanNode> q = new PriorityQueue<huffmanNode>(n, new HCPcomparator());

		for (int i = 0; i < n; i++) {
			huffmanNode hn = new huffmanNode();
			hn.c = c[i];
			hn.data = data[i];
			hn.left = null;
			hn.right = null;
			q.add(hn);
		}

		huffmanNode root = null;

		while (q.size() > 1) {
			huffmanNode x = q.poll();
			huffmanNode y = q.poll();

			huffmanNode f = new huffmanNode();
			f.data = x.data + y.data;
			f.c = '-';
			f.left = x;
			f.right = y;

			root = f;
			q.add(root);
		}
           int total = root.data*8;
		System.out.println("The original length: " +total);
		print(root, "", c, data);  // ✅ fixed
		System.out.println("The compression length: " + count); 
		System.out.println("The comppression percentage: "+((double)(total-count)/total)*100+"%");// ✅ now it shows correct value
	}

	private static void print(huffmanNode root, String s, char[] c, int[] data) {
		if (root.left == null && root.right == null && Character.isLetter(root.c)) {
			System.out.println(root.c + ": " + s);
			int fre = 0;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == root.c) {
					fre = data[i];
					break;
				}
			}
			count += fre * s.length();
			return;
		}

		print(root.left, s + "0", c, data);
		print(root.right, s + "1", c, data);
	}
}