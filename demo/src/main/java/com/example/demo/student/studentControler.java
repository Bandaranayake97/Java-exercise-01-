package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class studentControler {
@Autowired
    private studentservice servis;

@GetMapping("/student")
    public String showallStudent(Model model){
    List<userstudent> liststudent = servis.list();
    model.addAttribute("liststudent",liststudent);
    return "student";

}
}

