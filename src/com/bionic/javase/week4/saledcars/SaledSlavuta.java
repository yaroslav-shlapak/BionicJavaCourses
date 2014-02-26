package com.bionic.javase.week4.saledcars;

public class SaledSlavuta extends Slavuta {
	public Tovar tovar = new Tovar() {

		@Override
		public double getBasicPrice() {

			return 10000;
		}

		@Override
		public double getDiscount() {
			if (year < 5)
				return 1;
			else
				return 0.75;
		}
	};
}
