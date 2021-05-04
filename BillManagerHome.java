package com.vignesh.bill;
//Java implementation to calculate the
//electricity bill
class BillManagerHome {

	// Function to calculate the
    // electricity bill for home 
	public static double homeBill(int units) {
		double billpay = 0;

		int subsidy = 150;

		int fixed_price_101_200 = 20;
		int fixed_price_201_300 = 30;
		int fixed_price_301_500 = 50;
		int fixed_price_above_500 = 70;
		double rate0_100 = 0.0;
		double rate101_200 = 1.50;
		double rate201_300 = 2.0;
		double rate301_500 = 3.0;
		double rateMoreThan500 = 6.0;
         

        // Condition to find the charges
        // bar in which the units consumed
        // is fall
		if (units >= 1 && units <= 100) {
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