package ru.clevertec.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
    public String showEmployeeDetails() {
        return "show_emp_details_view";
    }
}
