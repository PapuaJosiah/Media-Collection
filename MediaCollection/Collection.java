package MediaCollection;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection {
    public ArrayList<Media> mediaList=new ArrayList<>();

    public void addMedia(Media newItem) {
        mediaList.add(newItem);
    }

    public void printList() {
        for (int i = 0; i < mediaList.size(); i++) {
            System.out.println(mediaList.get(i));
        }
    }

    public void countList() {
        System.out.println(mediaList.size());
    }

    public void sort(Comparator<Media> c){
        mediaList.sort(c);
    }

    public void viewItem(String ID){
        for(Media m: mediaList) {
            if(m.getUniqueID()==ID){
                m.viewMedia();
            }
        }
    }
}


    class numViewsComparator implements Comparator<Media>{
        public int compare(Media a, Media b){
            return a.getnumViews()-b.getnumViews();
        }
    }




