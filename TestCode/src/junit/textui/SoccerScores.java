package junit.textui;

public class SoccerScores {
	public static void main(String[] args) {
		 
	    String results = "Manchester United 1 Chelsea 0, Arsenal 1 Manchester United 1, Manchester United 3 Fulham 1, Liverpool 2 Manchester United 1, Swansea 2 Manchester United 4";
	 
	    String[] result_array = results.split(",");
	 
	    int number_of_wins = 0;
	    int number_of_draws = 0;
	    int number_of_defeats = 0;
	    int number_of_points = 0;
	 
	    int goals_scored = 0;
	    int goals_conceded = 0;
	 
	    for (int i = 0; i < result_array.length; i++)
	    {
	        String the_result = getResults(result_array[i].trim());
	        String[] match_facts = the_result.split("-");
	 
	        if (match_facts[0].equals("0"))
	         {
	             number_of_defeats++;
	         }
	 
	         if (match_facts[0].equals("1"))
	         {
	             number_of_draws++;
	             number_of_points = number_of_points + 1;
	         }
	 
	         if (match_facts[0].equals("3"))
	         {
	             number_of_wins++;
	             number_of_points = number_of_points + 3;
	         }
	 
	    goals_scored = goals_scored + Integer.parseInt(match_facts[1]);
	    goals_conceded=goals_conceded+Integer.parseInt(match_facts[2]);            
	    }
	 
	    System.out.println("number of wins =" + number_of_wins);
	    System.out.println("number of draws =" + number_of_draws);
	    System.out.println("number of defeats =" + number_of_defeats);
	 
	    System.out.println("goals scored =" + goals_scored);
	    System.out.println("goals conceded =" + goals_conceded);
	 
	    System.out.println("number of points =" + number_of_points);
	}
	public static String getResults(String result) {
		 
	    String point_and_goals = "";
	 
	    String[] result_array = result.split(" ");
	    int first_score = 0;
	    int second_score = 0;
	    int counter = 0;
	 
	    for (int i = 0; i < result_array.length; i++)
	    {
	        try {
	            int outputValue = 0;
	            outputValue = Integer.parseInt(result_array[i]);
	             
	            if (counter == 0)
	            {
	                first_score = outputValue;
	                counter++;
	            }
	            else
	            {
	                second_score = outputValue;
	            }
	        } catch (NumberFormatException e) {
	                 
	        }
	    }
	 
	    String HOME_WIN = "3";
	    String AWAY_WIN = "3";
	    String DRAW = "1";
	    String LOSS = "0";
	 
	    int man_utd = result.indexOf("Manchester United");
	 
	    if (man_utd == 0)
	    {
	            if (first_score > second_score)
	            {
	                point_and_goals = HOME_WIN + "-" + first_score + "-" + second_score;
	            }
	            else if (second_score > first_score)
	            {
	                point_and_goals = LOSS + "-" + first_score + "-" + second_score;
	            }
	            else if (first_score == second_score)
	            {
	                point_and_goals = DRAW + "-" + first_score + "-" + second_score;
	            }
	        }
	    else if (man_utd > 0)
	    {
	            if (second_score > first_score)
	            {
	                point_and_goals = AWAY_WIN + "-" + second_score + "-" + first_score;
	            }
	            else if (first_score > second_score)
	            {
	                point_and_goals = LOSS + "-" + second_score + "-" + first_score;
	            }
	            else if (first_score == second_score)
	            {
	                point_and_goals = DRAW + "-" + second_score + "-" + first_score;
	            }
	        }
	 
	    return point_and_goals;
	}
}
