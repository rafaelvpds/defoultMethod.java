package service;

import java.security.InvalidParameterException;

public class UsaInterestService {
	private Double interestRate;

	public UsaInterestService(Double interestRate) {

		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public double payment(double amount, int month) {
		if (month < 1) {
			throw new InvalidParameterException("Months must greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100, month);
	}
}
