package collection.sorting;

import java.util.Comparator;

public class ComparartorClass implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return student.stdId-t1.stdId;
    }
}
