import java.util.*;

public class FeedClass {
    List<User> userCollection;
    List<String> news;

    public FeedClass() {
        userCollection = new ArrayList<>();
        news = new LinkedList<>();
    }

    public void addUser(String nome, boolean premium) {
        if (premium)
            userCollection.add(new PremiumUser(nome));
        else
            userCollection.add(new StandardUser(nome));
    }

    public void addNews(String text, boolean premium){
        news.add(text);

        for (User u : userCollection) {
            if (u instanceof StandardUser) {
                if (!premium)
                    u.update(text);
            } else
                u.update(text);
        }
    }

    public void deleteUser(String nome) {
        for (User u : userCollection) {
            if (u.getNome().equals(nome)) {
                userCollection.remove(u);
                break;
            }
        }
    }
    
    public Iterator<User> getUsers() {
    	return userCollection.iterator();
    }
}
