package collection.sorting;

import java.util.*;

public class MainClassSort {
    public static void main(String args[]){
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student(01,"Saaa"));
        array.add(new Student(02,"Sree"));
        array.add(new Student(03,"Assh"));
        array.add(new Student(04,"Bassh"));

        System.out.println("Before Sorting");
        System.out.println(array);
        System.out.println("After sorting");
        Collections.sort(array, new ComparartorClass());
        System.out.println(array);

        // map always get sorted based on their keys.
        Map<Student,Integer> map2 = new TreeMap<>(new ComparartorClass());

        map2.put(new Student(01,"Saaa"),10001);
        map2.put(new Student(02,"Sree"),1002);
        map2.put(new Student(03,"Assh"),10003);
        map2.put(new Student(04,"Bash"),10004);
        map2.put(new Student(05,"Cash"),10005);

        System.out.println("After sorting map -- " + map2);


        Set<Student> set = new TreeSet<>(new ComparartorClass());

        set.add(new Student(01,"Saaa"));
        set.add(new Student(02,"Sree"));
        set.add(new Student(03,"Assh"));
        set.add(new Student(04,"Bassh"));

        System.out.println("After sorting set -- " + set);

    }
}
