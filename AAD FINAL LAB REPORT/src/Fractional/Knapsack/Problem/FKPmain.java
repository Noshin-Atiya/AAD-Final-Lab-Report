package Fractional.Knapsack.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FKPmain {
	public static void main(String[] args) {
		
		ArrayList<itemValues> list = new ArrayList<itemValues>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			itemValues item = new itemValues();
			System.out.print("Enter the item"+(i+1)+" name: ");
			item.setItem(sc.nextLine());
			System.out.print("Enter the weight of "+item.getItem()+" :");
			item.setWeight(sc.nextDouble());
			System.out.print("Enter the profit of "+item.getItem()+" :");
			item.setProfit(sc.nextDouble());
			sc.nextLine();
			list.add(item);
		}
		Collections.sort(list, new FKPcomparator());
		select(list);
	}
	public static void select(ArrayList<itemValues> list) {
		double capacity;
		System.out.println("Enter the Capacity of the Knapsack: ");
		Scanner s = new Scanner(System.in);
		capacity =s.nextDouble();
		double profit=0;
		for(itemValues i : list) {
			if(capacity==0) {
				break;
			}
			if(capacity>=i.getWeight()) {
				
				capacity = capacity-i.getWeight();
				profit = profit+i.getProfit();
			}
			else
			{
				profit = profit + (i.getProfit()*capacity)/i.getWeight();
				capacity = 0;
			}
			System.out.println(i);
		}
		System.out.println("Total Profit = "+profit);
		
	}

}