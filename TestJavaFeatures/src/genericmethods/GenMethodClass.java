package genericmethods;

public class GenMethodClass  {

    public <E extends Student> void display(E[] a){

        for(E e : a) {
            System.out.println(e);
        }
    }


    public void display2(RecordClass<? extends Student> obj){

        System.out.println(obj.list);

    }
}