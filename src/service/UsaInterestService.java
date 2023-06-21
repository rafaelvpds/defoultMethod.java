package service;

public class UsaInterestService implements InterestSrevice {
	private Double interestRate;

	public UsaInterestService(Double interestRate) {

		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}
