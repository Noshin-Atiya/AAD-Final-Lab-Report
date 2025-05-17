package Huffman.coding.problem;


import java.util.Comparator;

public class HCPcomparator implements Comparator<huffmanNode>{

	@Override
	public int compare(huffmanNode x, huffmanNode y) {
		// TODO Auto-generated method stub
		return  x.data - y.data;
	}
	

}