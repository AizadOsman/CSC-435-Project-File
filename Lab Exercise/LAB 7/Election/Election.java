
public class Election //methods
{
    private String candidateName;
    private int ageCandidate;
    private String partyVote;
    private String areaCandidate;
    private int polls;
    
    public Election(String c, int ag, String par, String ar, int pll) //normal constructor
    {
        candidateName = c;
        ageCandidate = ag;
        partyVote = par;
        areaCandidate = ar;
        polls = pll;
    }

    //accessor
    public String getCandidateName()
    {
       return candidateName; 
    }
    public int getAgeCandidate()
    {
       return ageCandidate; 
    }
    public String getPartyVote()
    {
       return partyVote; 
    }
    public String getAreaCandidate()
    {
       return areaCandidate; 
    }
    public int getPolls()
    {
       return polls; 
    }
    
    //processor
    public int determineWinner(Election []e)
    {
        int index=0;
        int polls = e[0].getPolls();
        
        for(int j=0; j<e.length; j++)
        {
            if (polls<e[0].getPolls())
            {
                polls = e[j].getPolls();
                index = j;
            }
        }
        return index;
    }
}
