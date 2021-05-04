package com.vignesh.bill;
//Java implementation to calculate the
//electricity bill
public class BillManagerCommercial {
	// Function to calculate the
    // electricity bill for commercial
	public static double commercialBill(int units) {
		double billpay = 0;

		int fixed_price_101_200 = 50;
		int fixed_price_201_300 = 70;
		int fixed_price_301_500 = 90;
		int fixed_price_above_500 = 100;
		double rate0_100 = 2.0;
		double rate101_200 = 3.50;
		double rate201_300 = 5.0;
		double rate301_500 = 7.50;
		double rateMoreThan500 = 9.0;
		 // Condition to find the charges
        // bar in which the units consumed
        // is fall
		if (units <= 100) {
			billpay = units * rate0_100;
		} else if (units >= 101 && units <= 200) {

			billpay = fixed_price_101_200 + (units * rate101_200);

		}

		else if (units >= 201 && units <= 300) {
			billpay = fixed_price_201_300 + (units * rate201_300);
		}

		else if (units >= 301 && units <= 500) {
			billpay = fixed_price_301_500 + (units * rate301_500);
		} else if (units > 500) {
			billpay = fixed_price_above_500 + (units * rateMoreThan500);
		}

		return billpay;
	}

}
