import java.util.*;

public class FeedClass {
    List<AbstractUserClass> userCollection;
    List<String> news;
    public FeedClass(){
        userCollection= new ArrayList<>();
        news = new LinkedList<>();
    }
    public void addUser(String nome,boolean premium){
        if(premium)
            userCollection.add(new PremiumUser(nome));
        else
            userCollection.add(new StandardUser(nome));
    }
}
