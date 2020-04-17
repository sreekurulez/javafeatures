package genericmethods;

import java.util.ArrayList;
import java.util.List;

public class RecordClass<E> {
    List<E> list = new ArrayList<>();

    public void addList(E e){
        this.list.add(e);
    }

    @Override
    public String toString() {
        return "RecordClass{" +
                "list=" + list +
                '}';
    }
}
