package seEVM;

public class Candidate
{

    private String name;    
    private int votes;
    
	public Candidate(elect evm,String name)
    {        
    	this.name = name;
        votes = 0;
    }


    public void incrementVoteCount()
    {
        votes++;
    }

    public String getName()
    {
        return name;
    }
    
    public int getNumberOfVotes()
    {
        return votes;
    }
    
	
    

}