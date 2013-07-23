package otherNamePakage;

public class RealCoin implements ICoin {



	private int weight;
	private int privatNumber;
	
	public RealCoin () {
		weight = 10;
		System.out.println("RealCoin");
	}
	
	@Override
	public int getprivatNumber() {
		return privatNumber;
	}

	@Override
	public void setprivatNumber(int s) {
		privatNumber = s;
	}

	@Override
	public int getweight() {
		return weight;
	}

	@Override
	public void setweight(int s) {
		weight = s;

	}

}
