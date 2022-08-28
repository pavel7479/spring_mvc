package com.pavel.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirst () {
        return "first";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails (Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details";
    }
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails (HttpServletRequest request, Model model) {
//        String employeeName = request.getParameter("employeeName");
//        String mrEmployeeName = "Mr. " + employeeName;
//        model.addAttribute("changeName", mrEmployeeName);
//
//        return "show-emp-details";
//    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails (@Valid @ModelAttribute("employee") Employee employee,
                                       BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "ask-emp-details";
        else return "show-emp-details";

    }
}
