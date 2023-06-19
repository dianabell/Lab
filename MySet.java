import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MySet<T> {

    private List<T> list = new ArrayList<>();

    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        return list.add(element);
    }

    public boolean remove(T element) {
        return list.remove(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

}