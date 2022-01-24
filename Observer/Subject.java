package Observer;
/**
 * a Subject that registers, removes and notifies the observer
 * @author Will Columbia
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver(); 
}
