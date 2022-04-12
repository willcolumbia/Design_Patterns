import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/**
 * a class music box that decides what language and song is played
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;
/**
 * sets the default variable
 */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
        
    }
/**
 * calls press star button from the state interface
 */
    public void pressStarButton() {
        state.pressStarButton();
    }
/**
 * calls teh press happy button from the state interface
 */
    public void pressHappyButton() {
        state.pressHappyButton();
    }
/**
 * calls press english button from state interface
 */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }
/**
 * calls press french button from state interface
 */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
/**
 * calls press spanish button from state interface
 */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }
/**
 * sets the state based on the state passed
 * @param state
 */
    public void setState(State state) {
        this.state = state;
    }
/**
 * gets the english state
 * @return english state
 */
    public State getEnglishState() {
        return englishState;
    }
/**
 * get the french state
 * @return frenchstate
 */
    public State getFrenchState() {
        return frenchState;
    }
/**
 * gets the spanish state
 * @return spanish state
 */
    public State getSpanishState() {
        return spanishState;
    }
/**
 * prints the song name and lyrics 
 * @param songName
 * @param lyrics
 */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("\n");
        System.out.println("Playing: "+songName+"\n");
        for(int i = 0;i<lyrics.size();i++)
        {
            System.out.println(lyrics.get(i));
            sleep(1);
        }
    }
/**
 * allows for a break in song printing
 * @param num
 */
    private void sleep(int num) {
        try {
            TimeUnit.SECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timer error");
        }
    }
}