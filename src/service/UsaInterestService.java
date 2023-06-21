package service;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestSrevice {
	private Double interestRate;

	public UsaInterestService(Double interestRate) {

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
