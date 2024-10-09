public class Scoreboard {

//instance variables
    private String teamOne;
    private String teamTwo;
    private int teamOneScore;
    private int teamTwoScore;
    private String activeTeam;

//methods
    public Scoreboard(String one, String two)
    {
        teamOne = one;
        teamTwo = two;
        activeTeam = teamOne;
    }
    public String getScore()
    {
        return teamOneScore + "-" + teamTwoScore + "-" + activeTeam;
    }
    public void recordPlay(int score)
    {
        if(teamOne.equals(activeTeam)) 
            teamOneScore += score;
        if(teamTwo.equals(activeTeam))
            teamTwoScore += score;
        if(score == 0)
        {
            if(activeTeam.equals(teamOne)) activeTeam = teamTwo;
            else if(activeTeam.equals(teamTwo)) activeTeam = teamOne;
        }

    }


}
