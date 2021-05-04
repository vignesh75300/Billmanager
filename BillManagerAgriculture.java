package com.vignesh.bill;
//Java implementation to calculate the
//electricity bill
public class BillManagerAgriculture {
	// Function to calculate the
    // electricity bill for Agriculture 
	public static double agricultureBill(int units) {
		double billpay = 0;
		int subsidy = 100;

		int fixed_price_101_200 = 30;
		int fixed_price_201_300 = 40;
		int fixed_price_301_500 = 60;
		int fixed_price_above_500 = 80;
		double rate0_100 = 0.50;
		double rate101_200 = 1.0;
		double rate201_300 = 1.50;
		double rate301_500 = 2.50;
		double rateMoreThan500 = 4.0;
		 // Condition to find the charges
        // bar in which the units consumed
        // is fall
		if (units <= 100) {
			billpay = units * rate0_100;
		} else if (units >= 101 && units <= 200) {

			billpay = fixed_price_101_200 + (units * rate101_200) - (subsidy);

		}

		else if (units >= 201 && units <= 300) {
			billpay = fixed_price_201_300 + (units * rate201_300) - (subsidy);
		}

		else if (units >= 301 && units <= 500) {
			billpay = fixed_price_301_500 + (units * rate301_500) - (subsidy);
		} else if (units > 500) {
			billpay = fixed_price_above_500 + (units * rateMoreThan500) - (subsidy);
		}

		return billpay;

	}

}
