package Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * Adds a special charcter after a character 30% of the time
 * @author Will Columbia 
 */
public class SpecialChars extends PasswordDecorator{
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }
    @Override
    public String getPassword() {
        String temp = passwordBeginning.getPassword();
        char[] chars = temp.toCharArray();
        String specialChars = "*!%+.{}";
        int len = temp.length();
        double large = len * 0.3;
        double fin = large + len;
        char[] what = new char[(int) (len+fin)];
        char[] spChars = specialChars.toCharArray();
        Random rand = new Random();
        for(int i = 0;i<chars.length;i++) {
            for(int j =0;j<spChars.length;j++) {
                if(rand.nextInt(100) < 30){
                    what[i] = chars[i];
                    what[i+1] = chars[i];
                    // what[i+1] = spChars[j];
            
                }
            }
        }
        return new String(what);
    }
    
}
