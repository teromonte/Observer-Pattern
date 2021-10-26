import java.util.*;

public class PremiumUser implements User {
    private String nome;
    private List<String> newsList;
    public PremiumUser(String nome) {
        this.nome = nome;
        newsList = new ArrayList<>();
    }

    public void update(String news){
        newsList.add(news);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Iterator<String> newsIterator() {
        return newsList.iterator();
    }
}