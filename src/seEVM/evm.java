package seEVM;

public class evm {



	public static void main(String[] args) {
		
		elect p=new elect(1,"ponda");
		Candidate c1=new Candidate(p,"vru");
		Candidate c5=new Candidate(p,"nali");
		
		elect m=new elect(2,"panjim");
		Candidate c2=new Candidate(m,"tanaya");
		Candidate c3=new Candidate(m,"Shraddha");
	
		
		
		Voter v=new Voter(101,c1);
		c1.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");
		
		
		Voter v2=new Voter(102,c1);
		c1.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");
		
	
		Voter v5=new Voter(103,c1);
		c1.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");
		
		
		Voter v3=new Voter(103,c3);
		c3.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");		
	
		Voter v4=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");
		
		
		Voter v6=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("BLUE button pressed... vote recorded");
	
		System.out.println("-------------------------------------");
		System.out.println(c1.getName()+" got "+c1.getNumberOfVotes()+" number of votes from "+ p.getConstinuency());
		System.out.println(c5.getName()+" got "+c5.getNumberOfVotes()+" number of votes from "+ p.getConstinuency());
	
		System.out.println(c3.getName()+" got "+c3.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println(c2.getName()+" got "+c2.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println("-------------------------------------");
		System.out.println("poll closed:");
		System.out.print(elect.closepoll());
		
		
		System.out.println("-------------------------------------");
		System.out.println("Total number of votes polled during the poll is "+Voter.counter());
		
		System.out.println("-------------------------------------");
		Voter.resetCounter();
		System.out.println("after reset counter :");
		System.out.println("Total number of votes polled during the poll is "+Voter.counter());
		System.out.println("-------------------------------------");
		
		
}

}
