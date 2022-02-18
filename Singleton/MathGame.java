package Singleton;

import java.util.Random;
import java.util.Scanner;
/**
 * A math game that gives the user a random simple math equations and gives points per correct answer
 * @author Will Columbia
 */


public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;
    private int upper = 100;
/**
 * Creates a new random. 
 * sets the mathgame 
 * loads the different operands into a string array. 
 * sets the scanner. 
 * Prints out opening message
 */
    private MathGame(){
        rand = new Random();
        this.mathGame = mathGame;
        operands = new String[] {"+","-","*","/"};
         this.reader = new Scanner(System.in);
        System.out.println("Lets have fun with Math");
    }
/**
 * creates and returns a new instance of a mathGame if there is not one, otherwise it returns the current game
 * @return new MathGame()
 * @return mathGame
 */
    public static MathGame getInstance(){
        if(mathGame == null){
            return new MathGame();
        }
        else{
            return mathGame;
        }
    }
/**
 * Loops though the game if the user inputs P
 * Stops the game if the user enters q
 * if the user enters something other than p or q then an error message is printed and loops again
 */
    public void play(){
        boolean playboi = true;
        while(playboi){
        System.out.println("Press (P) to Play or (Q) to Quit");
        String input = reader.nextLine();
        if(input.equalsIgnoreCase("q")){
            playboi = false;
            System.out.println("You won: "+score+" games"+"\n"+"GOODBYE");
            System.exit(0);
        }
        else if(input.equalsIgnoreCase("p")){
            playboi = true;
            playRound();
        }
        else{
            System.out.println("Sorry, you must enter (P) or (Q)");
            playboi = true;
        }
       }
    }
/**
 * creates two random numbers for that will be used in the equation
 * gets a random operand from the array
 * prints out the randomized equation and takes in the users answer
 * checks if the users answer is correct or incorrect
 * if correct, the user is given a point
 * if incorrect, the correct answer is displayed 
 * When dividing, the answer is rounded to the first decimal 
 * @return false
 */
    private boolean playRound(){
        int num1 = rand.nextInt(upper);
        int num2 = rand.nextInt(upper);
        Double n1 = (double) num1;
        double n2 = (double) num2;
        String randOp = "";
        int index = rand.nextInt(operands.length);
        randOp = operands[index];
        double userAnswer= 0.0;
        double answer = 0.0;
        System.out.println("Your qustion is: (Round answer to the 1st decimal place)\n"+num1+randOp+num2+"=");
        userAnswer = reader.nextDouble();
        reader.nextLine();
        if(randOp == "+"){
            answer = num1 + num2;
        }
        else if(randOp == "-"){
            answer = num1 - num2;
            
        }
        else if(randOp == "*"){
            answer = num1 * num2;
        }
        else{
            answer = (double) Math.round((n1/n2)*10.0) / 10.0; 
        }
        
        if(userAnswer == answer){
            System.out.println("That is correct!!!");
            score = score+1;
            System.out.println("SCORE: "+score);
            return true;
        }
        else{
            System.out.println("Sorry that is incorrect. The answers is "+answer+"\n"+";(");
            return false;
        }
    }

}
