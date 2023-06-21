package service;

import java.security.InvalidParameterException;

public interface InterestSrevice {
	Double getInterestRate();

	default double payment(double amount, int month) {
		if (month < 1) {
			throw new InvalidParameterException("Months must greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100, month);
	}
}
