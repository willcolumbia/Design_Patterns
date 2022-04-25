public class SongAdapter extends Song {
private Tune tune;
   
   public SongAdapter(Tune tune) {
       this.tune = tune;
       
   }
   
    @Override
    public String getTitle() {
        String temp = tune.getDisplayTitle();
        String[] split = temp.split(":");
        return split[0];
    }

    @Override
    public String getAlbum() {
        String temp = tune.getDisplayTitle();
        String[] split = temp.split(":");
        return split[1];
    }

    @Override
    public String getArtistFirstName() {
        String temp = tune.getArtistName();
        String[] split = temp.split("\\s+");
        return split[0];
    }

    @Override
    public String getArtistLastName() {
        String temp = tune.getArtistName();
        String[] split = temp.split("\\s+");
        return split[1];
    }

    @Override
    public Genre getGenre() {
        if(tune.getCategory().equalsIgnoreCase("country and western")) {
            return Genre.COUNTRY;
        }
        else if(tune.getCategory().equalsIgnoreCase("r&b and soul")) {
            return Genre.HIPHOP;
        }
        else if(tune.getCategory().equalsIgnoreCase("easy listening")) {
            return Genre.JAZZ;
        }
        else if(tune.getCategory().equalsIgnoreCase("rock")) {
            return Genre.ROCK;
        }
        else if(tune.getCategory().equalsIgnoreCase("classic rock")) {
            return Genre.POP;
        }
        return Genre.OTHER;
    }
    
}
