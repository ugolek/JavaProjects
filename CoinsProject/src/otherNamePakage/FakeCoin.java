package otherNamePakage;


public class FakeCoin implements ICoin {
	
	
	

	private int weight;
	private int privatNumber;
	
	public FakeCoin () {
		weight = Math.random()> 0.5 ? 9:11;
		System.out.println("FakeCoin");
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
