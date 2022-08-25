package com.pavel.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirst () {
        return "first";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails () {
        return "ask-emp-details";
    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails () {
        return "show-emp-details";
    }
}
