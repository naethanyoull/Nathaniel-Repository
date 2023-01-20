//Gay Test by Nathaniel

//Testing Push

//Imports
    //User Input (Scanner)
    import java.util.Scanner;

    //Random Number
    import java.util.Random;

    //Delay
    //import java.util.concurrent.TimeUnit;



//Main Class (GayTestV3)
public class GayTestV3 {

//Defining Variables
int gayness = 0;


//Constructors

    //Main Class Constructor (GayTestV3)
    public GayTestV3(){}

//Methods

    //Random Number Generator Method
    public int random(int something){
        Random randomNumb = new Random();
        int randomNumber = 0;
        randomNumber = randomNumb.nextInt(something);
    return randomNumber;
    }

    //Wait Method
    public void waiting(int wot){
        try {
            Thread.sleep(wot);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
    }

    //Question 1 Method: Make it based on name length
    public String questionOne(int questionOneAnswerNumber){
    String questionOneAnswer = "";
    //questionOneAnswerNumber = questionOneAnswerNumber - 1;   
    questionOneAnswerNumber %= 2;
        if (questionOneAnswerNumber == 0 ){
            questionOneAnswer = "you are " + gayness + 20 + "% gay so far!";
        } else {
            questionOneAnswer = "you are " + gayness + 0 + "% gay so far!";
        }

        return questionOneAnswer;
    } 

    //Question 2 Method: Based on chosen color
    public String questionTwo(String q2Color){
        String colorMeaning = "";
        
        //I need help for ideas of gayness so add a comment and insert a gayness % to add
        switch (q2Color){
        case "Red": colorMeaning = "";
        break;
        
        case "Orange": colorMeaning = "";
        break;

        case "Yellow": colorMeaning = "";
        break;
        
        case "Green": colorMeaning = "";
        break;

        case "Blue": colorMeaning = "";
        break;
        
        case "Indigo": colorMeaning = "";
        break;

        case "Violet": colorMeaning = "";
        break;
        
        case default: colorMeaning = "Not a color!";
        break;  
        }

        return colorMeaning;
    }

    //Main Method
    public static void main(String [] args){

        //Input Object
        Scanner input = new Scanner(System.in);

        //Random Object
        GayTestV3 randomObj = new GayTestV3();
        
        //Question 1
        System.out.println("What is your first and last name?");

        //Question 1 Input
        String name = input.nextLine();
        randomObj.waiting(2000);
        System.out.println("Calculating...");
        randomObj.waiting(2000);
       

        //Question 1 Output
        System.out.println("Wow " + name + ", " + randomObj.questionOne(name.length()));
        randomObj.waiting(1000);

        //Question 2
        System.out.println("Out of the following colors, which is your favorite? (Type One of the Listed Colors)");
        randomObj.waiting(1000);

        System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");

        //Question 2 Input
        String color = input.nextLine();
        randomObj.waiting(2000);
        if (randomObj.questionTwo(color) == "Not a color!"){
            System.out.println("You typed it wrong lol");
            randomObj.waiting(1000);
            System.out.println("Try again!");
            color = input.nextLine();
        }
        System.out.println("Calculating...");
        randomObj.waiting(2000);
        
        //Question 2 Output
        System.out.println("Interesting " + name + ",");
        randomObj.waiting(1000);
        System.out.println(randomObj.questionTwo(color));

input.close();
}





}