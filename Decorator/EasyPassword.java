package Decorator;
import java.util.Random;
/**
 * An easy password that takes in the original password, takes away white space and adds a random number to the end
 * @author Will Columbia
 */
public class EasyPassword extends Password{
    /**
     * sets the password to the phrase passed. deletes any white space. generates a random 2 digit number and appends 
     * it to the end of the password. calls getPassword()
     * @param phrase
     */
    public EasyPassword(String phrase){
        this.password= phrase;
        String temp = password;
    String temp2 = temp.replaceAll(" ", "");
    Random rand = new Random();
    int upperBound = 100;
    int randNum = rand.nextInt(upperBound);
    temp = temp2 + randNum;
    password = temp;
    getPassword();
    }
    /**
     * @return password
     */
    @Override
    public String getPassword() {
        return password;
    }
}
