package ru.clevertec.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show_emp_details_view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " a good man");
        return "show_emp_details_view";
    }
}
