package genericmethods;

import java.lang.reflect.Array;

public class MainClassGenMethods {
    public static void main(String args[]){
        Student std = new Student(01,"Sree");

        Student[] a = {std, new Student(100,"SAA")};
        GenMethodClass obj = new GenMethodClass();

        obj.<Student>display(a);

        String[] test = {"Sree","Kanth","Saa"};

        Hostler[] array = {new Hostler(1000,"Sachin",15000),new Hostler(10001,"Sachin2",15000)};
        obj.<Hostler>display(array);


        RecordClass<Student> studentRecord = new RecordClass<>();
        studentRecord.addList(std);
        studentRecord.addList( new Student(100,"SAA"));

        System.out.println(studentRecord.list);

        RecordClass<Hostler> hostelRecord = new RecordClass<>();

        hostelRecord.addList(new Hostler(1000,"Sachin",15000));

        System.out.println(hostelRecord.list);



    }
}
