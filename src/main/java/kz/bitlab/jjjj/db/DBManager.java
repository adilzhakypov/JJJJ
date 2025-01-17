package kz.bitlab.jjjj.db;

import kz.bitlab.jjjj.entity.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBManager {


    @Getter
    private static List<Student> students = new ArrayList<>();


    static {
        students.add(new Student(1L, "Adil", "A", 78, "A"));
        students.add(new Student(2L, "Sanzhar", "M", 34, "F"));
        students.add(new Student(3L, "Kuat", "Z", 65, "C"));
    }

    private static Long id = 5L;
    public static void addStudent(Student student){
    student.setId(id);
    student.setMark(calculateMark(student.getExam()));
    students.add(student);
    id++;
    }

    public static String calculateMark(int exam){
        if(exam >= 90){
            return("A");
        } else if (exam >= 75 && exam < 90) {
            return("B");
        } else if (exam >= 60 && exam < 75) {
            return("C");
        } else if (exam >= 50 && exam < 60) {
            return("B");
        } else {
            return("F");
        }
    }

}
