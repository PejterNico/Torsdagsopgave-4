import java.util.Scanner;

class Main{

	static String nameQ = ("Please type your name");

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		String inputName =  "";

		System.out.println(nameQ);
		
		inputName = scan.nextLine();

		System.out.println("Your name is: " + inputName + ", Please enter your age:");

		int inputAge =  scan.nextInt();

		System.out.println("Your name is: " + inputName + ", and you are: " + inputAge + " years old");

		int pension = 67;

		System.out.println("And you can then retire in: " + (pension-inputAge) + " years");
	}




}