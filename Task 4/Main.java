import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        GameMenu ui =  new GameMenu();
        int age = Integer.parseInt(ui.getInput("How old are you?"));
        //System.out.println(age);


        ArrayList<String> options = new ArrayList<String>();
        ArrayList<String> choices = new ArrayList<String>();

        if(age >= 18){
            options.add("Martini");
            options.add("Gin&Tonic");
            options.add("Saftemælk");
            options.add("Faxe Laks");
        }else{

            options.add("Vand");
            options.add("Pælk");

        }
        options.add("Spildevand");

        while(choices.size()<4){
        String choice = ui.getChoice(options, "Choose a drink");
        choices.add(choice);
        }
        System.out.println(choices);
    }












}