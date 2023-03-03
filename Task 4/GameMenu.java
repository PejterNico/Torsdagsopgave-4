import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;

class GameMenu{

    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private Scanner scan = new Scanner(System.in);


    public String getInput(String msg){

        System.out.println(msg);
        String input = scan.nextLine();
        
        if(!isNumeric(input)){
            input = getInput(msg);
        }

        return input;

    }

    public boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false; 
    }
    return pattern.matcher(strNum).matches();
    }


    public String getChoice(ArrayList<String> choices, String msg){
        
        System.out.println(msg);

        for(String c: choices){
            System.out.println(c);
        }
        String input = scan.nextLine();
        return input;
    }    
}