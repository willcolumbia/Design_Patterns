package Observer;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * a Poll that implaments Subject
 * @author Will Columbia
 */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers;
    private HashMap<String,Integer> votes;
    private String school;
    private int numUpdates;
/**
 * sets all of the constructors 
 * @param school
 */
    public StudentGovPoll(String school) {
        observers = new ArrayList<Observer>();
        votes = new HashMap<String,Integer>();
        this.school = school;
        
    }
    /**
     * adds a president canidate to votes hashmap
     * @param president
     */
    public void addCandidate(String president) {
        votes.put(president, 0);

    }
    /**
     * enters number of votes to the votes hashmap, notifies observer every 4th update
     * @param president
     * @param num
     */
    public void enterVotes(String president, int num) {
        votes.put(president,votes.get(president)+num);
        numUpdates++;
        if(numUpdates == 4) {
            numUpdates = 0;
        notifyObserver();
        }
    }
    /**
     * gets the school for the Gov Poll
     * @return school
     */
    public String getSchool() {
        return school;
    }
    /**
     * adds an observer
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        
        
    }
    /**
     * removes an observer
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        
        
    }
    /**
     * notifies observer when votes are updated
     */
    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(votes);
        }
        
    }

}
