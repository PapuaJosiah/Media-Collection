package MediaCollection;

public class Album extends Media {
    private String artist;
    private String numItems;

    public Album(String mediaTitle, String UniqueID, String Genre, String URL, String runTime, int numViews, String artist, String numItems){
        super(mediaTitle, UniqueID, Genre, URL, runTime, numViews);
    }

    public String getArtist() {
        return artist;
    }

    public String getNumItems() {
        return numItems;
    }
}
