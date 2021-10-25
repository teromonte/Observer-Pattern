import java.util.*;

public class FeedClass {
    List<User> userCollection;
    public FeedClass(){
        userCollection= new ArrayList<>();
    }
    public void addUser(String nome,boolean premium){
        if(premium)
            userCollection.add(new PremiumUser(nome));
        else
            userCollection.add(new StandardUser(nome));
    }
}
