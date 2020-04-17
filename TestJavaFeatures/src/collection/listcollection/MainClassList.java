package collection.listcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MainClassList {

    public static void main(String[] args) {
        LinkedList<Course> linkedList = new LinkedList<Course>();
        linkedList.add(new Course(99,"English"));
        linkedList.add(new Course(98,"Hindi"));
        linkedList.add(new Course(97, "Malayalam"));
        linkedList.addFirst(new Course(96,"Maths"));

        System.out.println("Linked List");
        Iterator<Course> cobj1 = linkedList.listIterator();
        while(cobj1.hasNext()){
            System.out.println(cobj1.next());
        }
        ArrayList<Course> arrayList = new ArrayList<Course>();
        arrayList.add(new Course(100,"Social Science"));
        arrayList.add(new Course(101,"Science"));
        arrayList.add(new Course(102,"SUPW"));

        System.out.println("Normal for loop");
        for(int count=0;count<arrayList.size();count++){
            System.out.println(arrayList.get(count));
        }

        System.out.println("for each loop");
        for (Course c: arrayList) {
            System.out.println(c);
        }

        System.out.println("Iterator");
        Iterator<Course> cobj = arrayList.listIterator();
        while (cobj.hasNext()){
            System.out.println(cobj.next());
        }

    }
}
