package genericclasses;

public class Student {
    public Student(int stdID, String name) {
        this.stdID = stdID;
        this.name = name;
    }

    int stdID;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", name='" + name + '\'' +
                '}';
    }
}
