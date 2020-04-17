package genericclasses;

public class MainClass {
    public static void main(String args[]){
        Student obj = new Student(100,"Sreekanth");
        Student obj1 = new Student(1001,"Saaa");

        ReportClass<Student> report = new ReportClass<>();

        report.addToArray(obj);
        report.addToArray(obj1);

        System.out.println("Student Record --- "  );
        report.display();

        ReportClass<Integer> reportInt = new ReportClass<>();
        reportInt.addToArray(100);
        reportInt.addToArray(10001);

        System.out.println("Integer Record --- "  );
        reportInt.display();

    }
}
