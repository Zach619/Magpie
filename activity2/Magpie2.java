package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *             Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting     
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("death") >= 0
                || statement.indexOf("die") >= 0)
        {
            response = "Kobe Bryant died in a helicopter crash Janurary 26,2020. Located at Calabasas California.";
        }
        else if (statement.indexOf("famous") >= 0
                || statement.indexOf("popular") >= 0
                || statement.indexOf("known") >= 0)
        {
            response = "Kobe Bryant was a basketball player in the NBA, he was a shooting guard and a small forward. He was most known as a Lakers Player.";
        }
        else if (statement.indexOf("age") >= 0
                || statement.indexOf("old") >= 0
                || statement.indexOf("Birthday") >= 0)
        {
            response = "Kobe Bryant was 41 years old, Birthday is August 23, 1978.";
        }
        else if (statement.indexOf("home") >= 0
            || statement.indexOf("live") >= 0
             || statement.indexOf("town") >= 0
              || statement.indexOf("city") >= 0
               || statement.indexOf("country") >= 0
               {
                   response = "I lived in 
               }
            else {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
