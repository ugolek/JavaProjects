package otherNamePakage;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinSelector {

	private ArrayList<ICoin> coinList;
	private ArrayList<Order> orderList;
	
	int firstWeight;
	int secondWeight;
	String signCompersion;
	
	
	public Order[] logicList = {
		new Order(new int [] {1,2,3,4}, new int [] {5,6,7,8}, new Object [] {1,2,3}),
		new Order(new int [] {1,2,5}, new int [] {3,4,6}, new Object [] {4,5,6}),
		new Order(new int [] {1,2,5}, new int [] {3,4,6}, new Object [] {7,8,9}),
		new Order(new int [] {9,10,11}, new int [] {1,2,3}, new Object [] {10,11,12}),
		
		new Order(new int [] {1}, new int [] {2}, new Object [] {"1 T","2 T","6 L"}),
		new Order(new int [] {3}, new int [] {4}, new Object [] {"3 T","4 T","5 L"}),
		new Order(new int [] {7}, new int [] {8}, new Object [] {"8 L","7 L"}),
		
		new Order(new int [] {3}, new int [] {4}, new Object [] {"4 L","3 L","5 T"}),
		new Order(new int [] {1}, new int [] {2}, new Object [] {"2 L","1 L","6 T"}),
		new Order(new int [] {7}, new int [] {8}, new Object [] {"7 T","8 T"}),
		
		new Order(new int [] {9}, new int [] {10}, new Object [] {"9 T","10 T","11 T"}),
		new Order(new int [] {9}, new int [] {10}, new Object [] {"10 L","9 L","11 L"}),
		new Order(new int [] {12}, new int [] {1}, new Object [] {"12 T","12 L"})
	};

	
	public String mainExecuter (Order temp)
	{
		orderList.add(temp);
		
		Object nextChain = temp.getArrayKeys()[getChain(temp)];
		if (nextChain instanceof String)
			return (String)nextChain;
		else
			return mainExecuter(logicList[(Integer)nextChain]);
	}
	
	
	public CoinSelector (ArrayList<ICoin> coinList, ArrayList<Order> orderList) {
		this.coinList = coinList;
		this.orderList = orderList;
	}
	

	private int getChain (Order temp)
	{
		int firstWeight = getWeightSum (temp.getFirstCupList());
		int secondWeight = getWeightSum (temp.getSecondCupList());
		if (firstWeight>secondWeight)
		{
			temp.setWeightMark(">");			
			return 0;
		}
		else if (firstWeight<secondWeight)
		{
			temp.setWeightMark("<");	
			return 1;
		}
		else
		{
			temp.setWeightMark("=");	
			return 2;
		}
	}
	

	private int getWeightSum (int[] value) {
		int transitSum = 0;
		for ( int i = 0; i < value.length; i++ ) {
			transitSum +=coinList.get(value[i]-1).getweight();
		}
		return transitSum;
	}
	
}
