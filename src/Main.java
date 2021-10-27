import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FeedClass f1 = new FeedClass();

        f1.addUser("Tiago", true);
        f1.addUser("Thiago", true);
        f1.addUser("Diogo", false);
        f1.addUser("Yuliia", true);
        f1.addUser("Pedro", false);

        f1.addNews("CR7 marca golo", true);
        f1.addNews("Neymar marca golo", false);
        
        Iterator<User> usersIt = f1.getUsers();
        User user;
        
        while (usersIt.hasNext()) {
        	user = usersIt.next();
        	System.out.println(user.getNome());
        	Iterator<String> newsIterator = user.newsIterator();
        	String news;
        	while (newsIterator.hasNext()) {
        		news = newsIterator.next();
        		System.out.println("---- " + news);
        	}	
        }
        
    }
}
