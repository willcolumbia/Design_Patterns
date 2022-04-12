import java.util.ArrayList;

public class FrenchState implements State {
private MusicBox box;

    public FrenchState(MusicBox box) {
        this.box = box;
    }

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

    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("you are already in the French state");
        
    }

    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        
    }
    
}
