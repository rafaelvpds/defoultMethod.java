package service;

import java.security.InvalidParameterException;

public class BrasilInterestService implements InterestSrevice {
	private Double interestRate;

	public BrasilInterestService(Double interestRate) {

		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}

	@Override
	public double payment(double amount, int month) {
		if (month < 1) {
			throw new InvalidParameterException("Months must greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100, month);
	}
}
