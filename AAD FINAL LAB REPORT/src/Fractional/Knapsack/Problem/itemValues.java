package Fractional.Knapsack.Problem;

public class itemValues {
	private String item;
	private double weight;
	private double profit;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	@Override
	public String toString() {
		return "itemValues [item=" + item + ", weight=" + weight + ", profit=" + profit + "]";
	}
	

}