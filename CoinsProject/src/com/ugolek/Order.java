package com.ugolek;

import java.util.Arrays;



public class Order {


	private int[] firstCupList;
	private int[] secondCupList;
	private Object[] arrayKeys;
	private String weightMark; 

	public Order(int[] firstCupList, int[] secondCupList, 
			Object[] arrayKeys) {

		this.setFirstCupList(firstCupList);
		this.setSecondCupList(secondCupList);
		this.setArrayKeys(arrayKeys);
	}

	public int[] getFirstCupList() {
		return firstCupList;
	}

	public void setFirstCupList(int[] firstCupList) {
		this.firstCupList = firstCupList;
	}

	public int[] getSecondCupList() {
		return secondCupList;
	}

	public void setSecondCupList(int[] secondCupList) {
		this.secondCupList = secondCupList;
	}

	public Object[] getArrayKeys() {
		return arrayKeys;
	}

	public void setArrayKeys(Object[] arrayKeys) {
		this.arrayKeys = arrayKeys;
	}
	
	public String getFirstArrayString () {
		return Arrays.toString(firstCupList);
	}
	
	public String getSecondArrayString () {
		return Arrays.toString(secondCupList);
	}

	public String getWeightMark() {
		return weightMark;
	}

	public void setWeightMark(String weightMark) {
		this.weightMark = weightMark;
	}


}
