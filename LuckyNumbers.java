public class LuckyNumbers {
    /* No instance variables */
  
    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }
  
    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
       /* implement this method  */
       return (int) (Math.random() * (max - min + 1)) + min;
    }
  
    /* Generates and returns a String containing lucky numbers
  
       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.
       
       In this game, the same number CAN appear more than once.
  
       The returned String should have the 6 numbers listed (they do not
       need to be in ascending order): 5 "lucky numbers" between 1 and 65,
       and the last one, the "super ball," between 1 and 30.
       See samples below.
  
       This method should call your randomIntegerBetween method above multiple times
      */
    public String getLuckyNumbers() {
        /* implement this method  */
        String luckyNumbers = "";
        String superBall = "";
        int count = 5;

        while (count > 0) {
            luckyNumbers += randomIntegerBetween(1, 65) + " ";
            count -= 1;
        }

        superBall += randomIntegerBetween(1, 30);

        return "Your lucky numbers are: " + luckyNumbers + "\n" + "The super ball is: " + superBall;
    }
}
    

