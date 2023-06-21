package service;

public class BrasilInterestService implements InterestSrevice {
	private Double interestRate;

	public BrasilInterestService(Double interestRate) {

		this.interestRate = interestRate;
	}

	// Não pode colocar esse method como default, pq esse metodo depende dos
	// atributos
	// aramzenada no serviço. E não pode colocar atributos armazenadas na interface.
	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}
