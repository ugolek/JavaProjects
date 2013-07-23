package com.ugolek;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@SessionScoped
@Named

public class SelectorBean  implements Serializable{

	private static final long serialVersionUID = -2998737950114995077L;
	private ArrayList<ICoin> coinList;


	private String testField;

	public String getTestField(){
		return testField;
	}

	public void setTestField(String testField){
		this.testField = testField;
	}

	@PostConstruct
	public void init () {
		testField="?";
	}

	public void generateCoinsList(){
		orderList.clear();
		testField="?";
		coinList = new ArrayList<ICoin>();
		for (int i = 0; i < 11; i++) {
			coinList.add(new RealCoin());
		}

		int fakePosition = (int)Math.round(Math.random()*11);
		coinList.add(fakePosition, new FakeCoin());

		for (int i = 0; i < coinList.size(); i++) {
			ICoin temp = coinList.get(i);
			temp.setprivatNumber(i+1);
		}

		System.out.println("init");
		System.out.println(fakePosition+1);
	}

	public void findFakeCoin(){
		orderList.clear();
		CoinSelector coinSelector = new CoinSelector(coinList, orderList);
		testField = coinSelector.mainExecuter(coinSelector.logicList[0]);
	}
	
	public boolean getFinderDisabled(){
		if (orderList.size()>0)
			return true;
		else
			return false;
	}


	private static final ArrayList<Order> orderList = new ArrayList<Order>();

	public ArrayList<Order> getOrderList(){
		return orderList;
	}


}
