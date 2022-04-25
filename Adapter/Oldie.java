public class Oldie implements Tune {
private String artistName;
private String songTitle;
private String recordTitle;
private String category;

    public Oldie(String artistName,String songTitle,String recordTitle,String category) {
       this.artistName = artistName;
       this.songTitle = songTitle;
       this.recordTitle = recordTitle;
       this.setCategory(category);
    }

    @Override
    public String getArtistName() {
        return this.artistName;
    }

    @Override
    public String getDisplayTitle() {
        return this.songTitle+":"+this.recordTitle;
    }

    @Override
    public String getCategory() {
        return this.category;
    }
    
    public void setName(String artistName) {
        String temp = artistName;
        String[] splitTemp = temp.trim().split("\\s+");
        this.artistName = splitTemp[0] +" "+ splitTemp[1];
    }

    public void setCategory(String category) {
        if( category.equalsIgnoreCase("country and western") || 
            category.equalsIgnoreCase("r&b and soul") ||
            category.equalsIgnoreCase("easy listening") || 
            category.equalsIgnoreCase("rock") || 
            category.equalsIgnoreCase("classic rock")) 
        {
            this.category = category;
        }
    }
}
