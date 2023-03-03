import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object
        Scanner scan = new Scanner(System.in);
    	// Read user input
    	int input = scan.nextInt();
        //use hasNextDouble to check if input is numeric, 
        public boolean isNumeric(String strNum){
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
        // if so...//   Compare it with the random number
        if (isNumeric(input) && input == rnd_number){
            //   Let the user know the result of the comparison
            System.out.println("The random number" + rnd_number + " and your number " + input + " is the same");
        } else {
            System.out.prinln("Your number are different");
        }
        //   Let the user try again by calling this method recursively

        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}