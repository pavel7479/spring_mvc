package com.pavel.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirst () {
        return "first";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails () {
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
    public String showEmployeeDetails (@RequestParam("employeeName") String employeeName, Model model) {
        String changeEmployeeName = "Mr. " + employeeName + "!";
        model.addAttribute("changeEmployeeName", changeEmployeeName);

    return "show-emp-details";
}
}
