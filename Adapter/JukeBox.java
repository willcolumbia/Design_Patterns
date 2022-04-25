import java.security.Key;
import java.util.HashMap;
import java.util.Set;

public class JukeBox {
    private HashMap<String,Song> songs;
    private int currentSong;

    public JukeBox() {
    this.songs = new HashMap<String,Song>();
        currentSong = 0;
    }

    public void addSong(Song song) {
            songs.put(song.getTitle().toLowerCase(), song);
    }

    public void play(String songName) {
        for(String song : songs.keySet()){
            if(song.equals(songName.toLowerCase())){
                songs.toString();
                
            }
            else{
                System.out.println("Sorry");
            }
        }
        // for(String song : songs.keySet()) {
        //     songs.toString();
        // }    

    }
}
