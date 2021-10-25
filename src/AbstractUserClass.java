import java.util.*;

public abstract class AbstractUserClass {
    private String nome;
    private List<String> news;

    protected AbstractUserClass(String nome){
        this.nome=nome;
        news = new LinkedList<>();
    }

    public void update(String news){
        this.news.add(news);
    }
}



