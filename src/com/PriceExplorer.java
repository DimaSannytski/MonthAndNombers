package com;



public class PriceExplorer {
	private  double[][] price;


	public void fillPrice() {
		price = new double[12][3];
		double valu = 2.5;
		for (int i = 0; i <= 11; i++) {
			for (int j = 0; j <= 2; j++) {
				price[i][j] = valu * (i + j + 2);
			}
		}
		
	}
	public int getNameForI(String i) {
		 i = i.toLowerCase();
		if (i == "jan") {
			return 0;
			
		} else if (i == "feb") {
			return 1;
		} else if (i == "mar") {
			return 2;
		} else if (i == "apr") {
			return 3;
		} else if (i == "may") {
			return 4;
		} else if (i == "jun") {
			return 5;
		} else if (i == "jul") {
			return 6;
		} else if (i == "aug") {
			return 7;
		} else if (i == "sep") {
			return 8;
		} else if (i == "oct") {
			return 9;
		} else if (i == "nov") {
			return 10;
		}  else if (i == "dec") {
			return 11;
		} 
		
		return 999;
	}
	public int getNameForJ(String j) {
		 j = j.toLowerCase();
		if (j == "prod1") {
			return 0;
			
		} else if (j == "prod2") {
			return 1;
		} else if (j == "prod3") {
			return 2;
		}
		return 999;
	}
	
	public void getPrice(String i, String j) {
		int arri = getNameForI(i);
		int arrj = getNameForJ(j);
		if (arri == 999 ) {
			System.err.println("Error " + i + " not exist");
			return;
		} else if (arrj == 999) {
			System.err.println("Error " + j + " not exist");
			return;
		}
		System.out.println("Price (" + i + " | " + j + ") = " + price[arri][arrj]);
	
	}
	
	
	public PriceExplorer() {

	}
	
}

