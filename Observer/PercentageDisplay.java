package Observer;
/**
 * Displays the percentage of votes each canidate recieved
 * @author Will Columbia
 */
import java.text.DecimalFormat;
import java.util.HashMap;


public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String,Integer> votes;
    private int numVotes;
    /**
     * sets the constructors 
     * @param poll
     */
    public PercentageDisplay(Subject poll) {
        votes = new HashMap<String,Integer>();
        this.poll = poll;
        poll.registerObserver(this);
    }
    /**
     * resets and updates the votes, adds up all the votes 
     * into numVotes, calls display
     * @param HashMap<String,Integer> votes
     */
    @Override
    public void update(HashMap<String,Integer> votes) {
        this.votes = votes;
        for(Integer j : votes.values()) {
            numVotes += j;
        }
        display();
        
    }
    /**
     * Find the percent of votes for each canidate and prints 
     * out the value
     */
    private void display() {
        System.out.println("Percent Votes:");
        for(String i : votes.keySet()) {
            double tally = votes.get(i);
            double percent = (tally / numVotes) * 100;
            DecimalFormat df = new DecimalFormat("##.#");
            percent = Double.valueOf(df.format(percent));
            System.out.println( i + ":" +  percent + "%");
        }
        System.out.print("\n");
    }
}
