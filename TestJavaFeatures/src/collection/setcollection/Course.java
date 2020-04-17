package collection.setcollection;

import java.util.Objects;

public class Course {

    int CourseId;
    String CourseName;

    public Course(int courseId, String courseName) {
        CourseId = courseId;
        CourseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return CourseId == course.CourseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(CourseId);
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseId=" + CourseId +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }
}
