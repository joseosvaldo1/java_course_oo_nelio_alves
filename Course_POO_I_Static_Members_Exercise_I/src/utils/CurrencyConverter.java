package utils;

public class CurrencyConverter {
	public static final double IOF_RATE = 0.06;
	
	public static double dollarToReal(double quantityDollar, double priceDollar) {
		return (1+IOF_RATE)*quantityDollar*priceDollar;
	}
	
	
}
