package collection.setcollection;

import java.util.LinkedHashSet;
import java.util.Set;


public class MainClass {

    public static void main(String args[]){
    Set<Course> set = new LinkedHashSet<Course>();

    set.add(new Course(100,"Malayalam"));
    set.add(new Course(98,"English"));
    System.out.println(set.add(new Course(102,"malayalam")));
    set.add(new Course(101,"SUPW"));

    System.out.println(set);

}}

