package genericclasses;

import java.util.ArrayList;
import java.util.List;

public class ReportClass<E> {
   List<E> eArray = new ArrayList<>();

    public List<E> geteArray() {
        return eArray;
    }

    public void addToArray(E obj){
        this.eArray.add(obj);
    }

    public void display(){
        System.out.println(this.eArray);
    }

}
