package collection.listcollection;

public class Course {
    int CourseID;

    public Course(int courseID, String courseName) {
        CourseID = courseID;
        CourseName = courseName;
    }

    String CourseName;

    @Override
    public String toString() {
        return "Course{" +
                "CourseID=" + CourseID +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }
}
