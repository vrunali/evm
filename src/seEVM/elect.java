package seEVM;


public class elect {
	
	private String constinuency;


	public elect(int id, String constinuency)
	{
		this.constinuency=constinuency;
	}
	

	public String getConstinuency() {
		return constinuency;
	}
	
	public static int closepoll()
	{
		System.out.println("Sorry.. You can't vote. Poll closed");
		return 0;
	}

}

