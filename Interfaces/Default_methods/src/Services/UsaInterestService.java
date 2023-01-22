package Services;

public class UsaInterestService implements InterestService{

	private double InterestRate;

	public UsaInterestService(double interestRate) {
		InterestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return InterestRate;
	}

}
