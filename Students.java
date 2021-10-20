package Bài3;
import java.util.Scanner;

public class Students {
    int id;
    String student_name;
    String semester;
    String course_name;
    int count1 = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public void create(){
        System.out.println();
    }

    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    public void output(){
        System.out.print("- ID " + getId() + "| Name: " + getStudent_name() + "| Semester: " + getSemester() + "| Course Name: " + getCourse_name() + "\n");
    }
    public void count(){
        count1 = count1 +1;
    }
}
