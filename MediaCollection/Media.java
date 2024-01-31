package MediaCollection;

public class Media {
    private String mediaTitle;
    private String UniqueID;
    private String Genre;
    private String URL;
    private String runTime;

    private int numViews;

    public Media( String mediaTitle, String UniqueID, String Genre, String URL, String runTime, int numviews){
        this.mediaTitle = mediaTitle;
        this.UniqueID=UniqueID;
        this.Genre=Genre;
        this.URL=URL;
        this.runTime=runTime;
        this.numViews=numViews;
    }
    public String getMediaTitle(){
        return mediaTitle;
    }
    public String getUniqueID(){
        return UniqueID;
    }
    public String getGenre(){
        return Genre;
    }
    public String getURL(){
        return URL;
    }
    public String getRunTime(){
        return runTime;
    }
    public int getnumViews(){return numViews;}

    public void viewMedia(){
        numViews++;
        System.out.println(mediaTitle);
    }


}
