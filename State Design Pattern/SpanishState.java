import java.util.ArrayList;

public class SpanishState implements State {
private MusicBox box;

    public SpanishState(MusicBox box) {
        this.box = box;
    }

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

    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
        
    }

    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());        
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("You are already in the Spanish state");
        
    }
    
}
