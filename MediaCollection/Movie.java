package MediaCollection;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    public String producer;
    public String Actors;


    public Movie(String mediaTitle, String UniqueID, String Genre, String URL, String runTime, int numViews, String producer, String Actors) {
        super(mediaTitle, UniqueID, Genre, URL, runTime, numViews);
    }

    public String getProducer() {
        return producer;
    }

    public String getActors() {
        return Actors;
    }
}
