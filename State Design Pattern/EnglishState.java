import java.util.ArrayList;

public class EnglishState implements State {
private MusicBox box;

    public EnglishState(MusicBox box) {
        this.box = box;
    }

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

    @Override
    public void pressEnglishButton() {
       System.out.println("You are already in english mode");
    }

    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
        
    }

    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
        
    }
    
}
