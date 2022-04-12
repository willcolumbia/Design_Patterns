import java.util.ArrayList;
/**
 * the class for the english verison of each song
 */
public class EnglishState implements State {
private MusicBox box;
/**
 * sets the music box
 * @param box
 */
    public EnglishState(MusicBox box) {
        this.box = box;
    }
/**
 * creates an arraylist with the english version of twinkle twinkle little star
 * calls playsong
 */
    @Override
    public void pressStarButton() {
        ArrayList<String> twinkle = new ArrayList<String>();
        String songName = "Twinkle,Twinkle Litter Star";
        twinkle.add("Twinkle, twinkle, little star");
        twinkle.add("How I wonder what you are");
        twinkle.add("Up above the world so high");
        twinkle.add("Like a diamond in the sky");
        twinkle.add("Twinkle, twinkle, little star");
        twinkle.add("How I wonder what you are");
        box.playSong(songName, twinkle);
    }
/**
 * creates an arraylist with the lyrics to the english version of happy and you know it
 * calls playsong
 */
    @Override
    public void pressHappyButton() {
        ArrayList<String> happy = new ArrayList<String>();
        String songName = "Happy And You Know It";
        happy.add("If you're happy and you know it clap your hands");
        happy.add("If you're happy and you know it clap your hands");
        happy.add("If you're happy and you know it");
        happy.add("And you really want to show it");
        happy.add("If you're happy and you know it clap your hands");
        box.playSong(songName, happy);

        
    }
/**
 * prints if already in english state
 */
    @Override
    public void pressEnglishButton() {
       System.out.println("You are already in english mode");
    }
/**
 * sets the state to the french state
 */
    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
        
    }
/**
 * sets the state to spanish
 */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        
    }
    
}
