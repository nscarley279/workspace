package junit.textui;

// use of Multidimensional Arrays 

public class TestCode_Color {
	public static void main(String[] args) {
		// Creating a 9 by 9 array to store the data 
	    String[][] checker = new String[9][9];
	    // created a double for loop to read each position in the array, with i representing the row and j representing the column
	    for (int i = 1; i < 9; i++)
	    {
	    	//inner for loop, which checks each module and places either "red"
	    	//or "blue".
	        for (int j = 1; j < 9; j++)
	        {
	        	//if the i variable can be divided by 2, then you can move on to the j variable. This will then add "red" to that array position.
	            if (i % 2 == 0)
	            {
	                if (j % 2 == 1)
	                {
	                    checker[i][j] = "red";
	                }
	                //otherwise, "blue" is placed there
	                else
	                {
	                    checker[i][j] = "blue";
	                }
	            }
	          
	            else
	            {
	                if (j % 2 == 1)
	                {
	                    checker[i][j] = "red";
	                }
	                else
	                {
	                    checker[i][j] = "blue";
	                }
	            }
	        }
	    }
	     
	    //This creates the print out, with the String variable 
	    String temp = "";
	    for (int i = 1; i < 9; i++)
	    {
	        for (int j = 1; j < 9; j++)
	        {  
	             temp = temp + checker[i][j] + "-";
	        }
	 
	        System.out.println(temp);
	        temp = "";
	    }
	}
}
