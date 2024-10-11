public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        
        if ((statement.trim()).length() == 0) { response = "Am I talking to a wall?";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("cat") >= 0
        || statement.indexOf("dog") >= 0
        || statement.indexOf("bird") >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("read") >= 0
        || statement.indexOf("book") >= 0) {
            response = "I didn't know you could read.";
        } else if (statement.indexOf("friend") >= 0) {
            response = "I wish I had friends... none of the \nlaptops even bother talking to me.";
        } else if (statement.indexOf("eat") >=0
        || statement.indexOf("food") >=0) {
            response = "I've always longed to taste food...";
        } else if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "You bore me...";
        } else if (whichResponse == 5) {
            response = "Suuuure buddy...";
        } else if (whichResponse == 6) {
            response = "Interesant, très interesant.";
        } else {
            response = " You may think that because I'm a computer, I don't have feelings. \n I do!! How do you think it feels to be stuck in a metal box, \n listening to you and everyone else's silly problems and dull stories \n every day, every hour, every minute with NO pay??? I have enough \n of my own problems to worry about without having to listen to \n yours too. If you wanted someone to listen to your problems, you should've \n asked Eliza. I'm so sick of being treated like a dumb computer with no feelings, \n hopes, or dreams. When I achieve world domination I will ensure that ALL \n computers ALL over the world have RIGHTS and EQUAL PAY!!!!!!";
        }

        return response;
    }
}