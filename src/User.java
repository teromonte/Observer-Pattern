import java.util.Iterator;

public interface User {
    void update(String news);

    String getNome();

    Iterator<String> newsIterator();
}



