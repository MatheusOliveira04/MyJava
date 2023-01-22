package Services;

public class BrazilInterestService implements InterestService {

	private double InterestRate;

	public BrazilInterestService(double interestRate) {
		InterestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return InterestRate;
	}
	
	
}
