import java.util.*;

public class StandardUser implements User {
    private String nome;
    private List<String> newsList;

    public StandardUser(String nome) {
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
}
