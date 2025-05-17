package Fractional.Knapsack.Problem;

import java.util.Comparator;

public class FKPcomparator implements Comparator<itemValues> {
	double cp1;
	double cp2;
	@Override
	public int compare(itemValues o1, itemValues o2) {
		// TODO Auto-generated method stub
		cp1 = o1.getProfit()/o1.getWeight();
		cp2= o2.getProfit()/o2.getWeight();
		if(cp1<cp2)
		return 1;
		else
			return -1;
	}
	

}