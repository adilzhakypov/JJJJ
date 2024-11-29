package kz.bitlab.jjjj.controller;

import kz.bitlab.jjjj.db.DBManager;
import kz.bitlab.jjjj.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model) {
        List<Student> students = DBManager.getStudents();
        model.addAttribute("studentter", students);
        return "home";
    }

}
