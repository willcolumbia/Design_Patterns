package Observer;
import java.util.HashMap;
/**
 * An observer with update method
 * @author Will Columbia
 */
public interface Observer {
    public void update(HashMap<String,Integer> votes);
    
}
