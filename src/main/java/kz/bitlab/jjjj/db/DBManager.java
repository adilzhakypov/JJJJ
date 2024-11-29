package kz.bitlab.jjjj.db;

import kz.bitlab.jjjj.entity.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBManager {
    Scanner scanner = new Scanner(System.in);

    @Getter
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Adil", "A", 78, "A"));
        students.add(new Student(2L, "Sanzhar", "M", 34, "F"));
        students.add(new Student(3L, "Kuat", "Z", 65, "C"));
    }

}
