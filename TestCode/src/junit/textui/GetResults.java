package junit.textui;

public class GetResults {
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
