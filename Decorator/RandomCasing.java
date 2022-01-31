package Decorator;

import java.util.Random;
/**
 * Makes 50% of characters uppercase and 50% lowercase 
 * @author WIll COlumbia
 */
public class RandomCasing extends PasswordDecorator{
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
    }
    /**
     * turns temp into a character array and creates a random number. If the random number 0-100 is less than 50 than the character at index
     * i is uppercased otherwise it is lowercased
     * @return temp
     */
    @Override
    public String getPassword() {
        String temp = passwordBeginning.getPassword();
        char[] chars = temp.toCharArray();
        Random rd = new Random();
        for(int i = 0;i<chars.length;i++) {
            if(rd.nextInt(100) < 50) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            else{
                chars[i] = Character.toLowerCase(chars[i]);
            }
            String revert = new String(chars);
            temp = revert;
        }
        return temp;
    }
}
