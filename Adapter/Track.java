public class Track extends Song{
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    public Track(String title,String ablum,String firstName,String lastName,Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
    @Override
    public String getTitle() {
        return this.title;
    }
    @Override
    public String getAlbum() {
        return this.album;
    }
    @Override
    public String getArtistFirstName() {
        return this.firstName;
    }
    @Override
    public String getArtistLastName() {
        return this.lastName;
    }
    @Override
    public Genre getGenre() {
        return this.genre;
    }




}
