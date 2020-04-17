package collection.mapcollection;

import java.util.Objects;

public class Course {



    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", Coursename='" + Coursename + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return courseID == course.courseID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseID);
    }

    int courseID;

    public Course(int courseID, String coursename) {
        this.courseID = courseID;
        Coursename = coursename;
    }

    String Coursename;
}
