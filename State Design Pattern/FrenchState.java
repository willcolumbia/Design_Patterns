import java.util.ArrayList;
/**
 * a class for the french version of each song
 */
public class FrenchState implements State {
private MusicBox box;
/**
 * sets box
 * @param box
 */
    public FrenchState(MusicBox box) {
        this.box = box;
    }
/**
 * creates a new arraylist with the french version of twinkle twinkle little star
 * calls playsong
 */
    @Override
    public void pressStarButton() {
        ArrayList<String> frenchTwinkle = new ArrayList<String>();
        String songName = "Brille, brille, petite étoile";
        frenchTwinkle.add("Brille, brille, petite étoile,");
        frenchTwinkle.add("Je me demande vraiment ce que tu es!");
        frenchTwinkle.add("Au-dessus du monde si haut,");
        frenchTwinkle.add("Comme un diamant dans le ciel");
        frenchTwinkle.add("Brille, brille, petite étoile,");
        frenchTwinkle.add("Je me demande vraiment ce que tu es!");
        box.playSong(songName, frenchTwinkle);

        
    }
/**
 * creates a new arraylist with the french version of happy and you know it
 * calls playsong
 */
    @Override
    public void pressHappyButton() {
        ArrayList<String> frenchHappy = new ArrayList<String>();
        String songName = "Si tu aimes le soleil";
        frenchHappy.add("Si tu aimes le soleil");
        frenchHappy.add("Frappe des mains.");
        frenchHappy.add("Si tu aimes le soleil");
        frenchHappy.add("Frappe des mains.");
        frenchHappy.add("Si tu aimes le soleil");
        frenchHappy.add("le printemps qui se réveille,");
        frenchHappy.add("Si tu aimes le soleil");
        frenchHappy.add("Frappe des mains.");
        box.playSong(songName, frenchHappy);
        
    }
/**
 * changes to english state
 */
    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        
    }
/**
 * prints if already in french state
 */
    @Override
    public void pressFrenchButton() {
        System.out.println("you are already in the French state");
        
    }
/**
 * changed to spanish state
 */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        
    }
    
}
