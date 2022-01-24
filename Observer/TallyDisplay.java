package Observer;
import java.util.HashMap;
/**
 * Displays the tallied amount of votes each canidate got
 * @author Will Columbia
 */

public class TallyDisplay implements Observer {
   private Subject poll;
   private HashMap<String,Integer> votes;
    /**
     * sets the constructors 
     * @param poll
     */
    public TallyDisplay(Subject poll) {
        votes = new HashMap<String,Integer>();
        this.poll = poll;
        poll.registerObserver(this);
    }
    /**
     * resets and updated the votes, calls display
     * @param HashMap votes
     */
    @Override
    public void update(HashMap<String, Integer> votes) {
            this.votes = votes;
            display();
    }
    /**
     * prints the tallied amount of votes for each canidate
     */
    private void display() {
        System.out.println("Tally Votes:");
        for(String i : votes.keySet()) {
            System.out.println( i + ":" + votes.get(i));
            }
            System.out.print("\n");
        }
    }

