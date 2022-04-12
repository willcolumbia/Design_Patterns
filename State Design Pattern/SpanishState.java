import java.util.ArrayList;
/**
 * a class for the spanish verison of each song
 */
public class SpanishState implements State {
private MusicBox box;
/**
 * sets box
 * @param box
 */
    public SpanishState(MusicBox box) {
        this.box = box;
    }
/**
 * creates a new arraylist with the spanish version of twinkle twinkle little star
 * calls playsong
 */
    @Override
    public void pressStarButton() {
        ArrayList<String> spanishTwinkle = new ArrayList<String>();
        String songName = "Estrellita Dónde Estás";
        spanishTwinkle.add("Estrellita ¿dónde estás?"); 
        spanishTwinkle.add("Me pregunto qué serás "); 
        spanishTwinkle.add("Esta noche allí estarás"); 
        spanishTwinkle.add("Cual diamante brillarás"); 
        spanishTwinkle.add("Estrellita ¿dónde estás?"); 
        spanishTwinkle.add("Me pregunto qué serás.");       
        box.playSong(songName, spanishTwinkle);
    }
/**
 * creates a new arraylist with the spanish version of happy and you know it
 * calls playsong
 */
    @Override
    public void pressHappyButton() {
        ArrayList<String> spanishHappy = new ArrayList<String>();
        String songName = "Si eres feliz y lo sabes";
        spanishHappy.add("Si eres feliz y lo sabes");
        spanishHappy.add("Bate las manos");
        spanishHappy.add("Si eres feliz y lo sabes");
        spanishHappy.add("Bate las manos");
        spanishHappy.add("Si eres feliz y lo sabes");
        spanishHappy.add("Entonces pon las señales");
        spanishHappy.add("Si eres feliz y lo sabes");
        spanishHappy.add("Bate las manos.");
        box.playSong(songName, spanishHappy);
        
    }
/**
 * changes to english state
 */
    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        
    }
/**
 * changes to french state
 */
    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());        
    }
/**
 * prints if already in spanish state
 */
    @Override
    public void pressSpanishButton() {
        System.out.println("You are already in the Spanish state");
        
    }
    
}
