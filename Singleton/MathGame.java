package Singleton;

import java.util.Random;
import java.util.Scanner;



public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;
    private int upper = 100;

    private MathGame(){
        rand = new Random();
        this.mathGame = mathGame;
        operands = new String[] {"+","-","*","/"};
         this.reader = new Scanner(System.in);
        System.out.println("Lets have fun with Math");
    }

    public static MathGame getInstance(){
        if(mathGame == null){
            return new MathGame();
        }
        else{
            return mathGame;
        }
    }

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
