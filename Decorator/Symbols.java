package Decorator;

/**
 * Adds symbols to the password based on similar characters and symbols
 * @author Will Columbia 
 */
public class Symbols extends PasswordDecorator{
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
    }
    /**
     * creates a character array of the password. If the character at the index has a symbol lookalike, they are switched respectively
     * @return temp
     */
    @Override
    public String getPassword() {
        String temp = passwordBeginning.getPassword();
            char[] chars = temp.toCharArray();
            for(int i = 0; i<chars.length;i++) {
                if(chars[i] == 'a') {
                    chars[i] = '@';
                }
                if(chars[i] == 'b') {
                    chars[i] = '8';
                }
                if(chars[i] == 'e') {
                    chars[i] = '3';
                }
                if(chars[i] == 'g') {
                    chars[i] = '9';
                }
                if(chars[i] == 'i') {
                    chars[i] = '!';
                }
                if(chars[i] == 'o') {
                    chars[i] = '0';
                }
                if(chars[i] == 's') {
                    chars[i] = '$';
                }
                if(chars[i] == 't') {
                    chars[i] = '7';
                }
                String revert = new String(chars);
                temp = revert;
            }
        return temp;
    }
    
}
