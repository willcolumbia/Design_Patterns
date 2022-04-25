public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract Genre getGenre();
   
    public String toString() {
        return "/n"+getTitle()+"\nAlbum: "+getAlbum()+"\nBy: "+getArtistFirstName()+" "+getArtistLastName()+"\nGenre: "+getGenre();
    }

}
