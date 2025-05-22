import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public boolean empty() {
        return list.isEmpty();
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }

    public E push(E obj) {
        list.add(obj);
        return obj;
    }
}
