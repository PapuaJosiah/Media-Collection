package MediaCollection;

public class MediaDriver {
    public static void main( String[] args ){
        Collection c=new Collection();
        c.addMedia(new Movie("The Dark Knight","01","Action","www.theDarkKnight.com", "2h32m", 0, "Christopher Nolan", "Christian Bale, Heath Ledger"));
        c.addMedia(new Movie("The Curse of the Black Pearl", "02", "Action/Adventure", "www.TheCurseOfTheBlackPearl.com", "2h23m", 0, "Gore Verbinski", "Johnny Depp, Orlando Bloom"));
        c.addMedia(new Movie("Simon Birch", "03", "Drama/Comedy", "www.SimonBirch.com", "1h54m", 0, "Laurence Mark", "Jim Carrey"));
        c.addMedia(new Album("Divide", "10","Pop", "www.Divide.com", "46m14s", 0, "Ed Sheeran", "16"));
        c.addMedia(new Album("Wasteland, Baby!", "11", "Soul/Blues","www.WastelandBaby.com","57m21s", 0, "Hozier", "14"));
        c.addMedia(new Album("Scaled and Icy", "12", "Alternative Pop", "www.ScaledandIcy.com", "37m42s", 0, "21 Pilots", "21"));

        c.printList();
        c.sort(new numViewsComparator());
        c.countList();
        c.viewItem("1");

    }
}
