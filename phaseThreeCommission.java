public class phaseThreeCommission {

	double lockPrice, stockPrice, barrelPrice;
	int totalLocks, totalStocks, totalBarrels;
	double lockSales, stockSales, barrelSales;
	double sales, commission;

	public void commission(int locks, int stocks, int barrels) {

		lockPrice = 35.0;
		stockPrice = 25.0;
		barrelPrice = 20.0;
		totalLocks = 0;
		totalStocks = 0;
		totalBarrels = 0;

		while (locks != -1) {

			totalLocks += locks;
			totalStocks += stocks;
			totalBarrels += barrels;

			//System.out.println(totalLocks);
			//System.out.println(totalStocks);
			//System.out.println(totalBarrels);

			lockSales = lockPrice * totalLocks;
			stockSales = stockPrice * totalStocks;
			barrelSales = barrelPrice * totalBarrels;

			sales = lockSales + stockSales + barrelSales;

			System.out.println("Sales:"+" "+sales);

			if (sales > 1800.0) {

				commission = .10 * 1000.0;
				commission = commission + .15 * 800.0;
				commission = commission + .20 * (sales - 1800.0);
			}

			else if (sales > 1000.0) {

				commission = .10 * 1000.0;
				commission = commission + .15 * (sales - 1000.0);
			} else {

				commission = .10 * sales;

			}

			break;

		}

		System.out.println("Commission:"+" "+commission);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		phaseThreeCommission test = new phaseThreeCommission();
		test.commission(10, 15, 16);

	}

}
