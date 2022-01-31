package Decorator;
/**
 * Holds a password
 * @author WIll COlumbia 
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;
    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
        
    }
    /**
     * @return password
     */
    @Override
    public String getPassword() {
        return password;
    }
}
