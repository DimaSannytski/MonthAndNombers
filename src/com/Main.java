package com;

public class Main {

	public static void main(String[] args) {
		PriceExplorer priceExp = new PriceExplorer();
		
		priceExp.fillPrice();
		
		priceExp.getPrice("jan", "prod3");
		priceExp.getPrice("jan", "prod2");
		priceExp.getPrice("jan", "prod1");
		
		priceExp.getPrice("lol", "prod3");
		priceExp.getPrice("feb", "prod2");
		priceExp.getPrice("feb", "prod1");
	}

}
