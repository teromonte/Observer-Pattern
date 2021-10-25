import java.util.*;

public class PremiumUser implements User {
    private String nome;
    private List<String> newsList;
    public PremiumUser(String nome) {
        this.nome = nome;
        newsList = new ArrayList<String>();
    }

    public void update(String news){
        newsList.add(news);
    }
}