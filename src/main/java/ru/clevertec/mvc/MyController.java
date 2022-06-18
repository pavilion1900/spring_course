package ru.clevertec.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask_emp_details_view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        return "show_emp_details_view";
    }
}
