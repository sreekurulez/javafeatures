package collection.mapcollection;

import java.security.KeyStore;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainClassMap {
    public static void main(String args[]){

        Map<Integer,Course> obj = new TreeMap<>();

        obj.put(001,new Course(100,"Hindi"));
        obj.put(002,new Course(99,"Malayalam"));
        obj.put(003,new Course(102,"SUPW"));

        System.out.println("Getting Map data using Value Set");
        for(Course c : obj.values()){

            System.out.println(c);

        }

        System.out.println("Getting Map data using keyset");
        for (Integer s : obj.keySet()){

            System.out.println(obj.get(s));
        }

        System.out.println("Getting Map data using Entry Set");
        for (Map.Entry<Integer, Course> o : obj.entrySet()){

            System.out.println(o.getKey() + "---" + o.getValue());
        }

    }
}
