package collection.sorting;

public class Student implements Comparable<Student>{

    int stdId;
    String name;

    public Student(int stdId, String name) {
        this.stdId = stdId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
