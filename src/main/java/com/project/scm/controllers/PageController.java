package com.project.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("inside home controller");
        model.addAttribute("name", "Prashant Kalsariya");
        model.addAttribute("link", "http://google.com");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage()
    {
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage()
    {
        return "services";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return new String("contact");
    }
    @GetMapping("/sign-up")
    public String signupPage() {
        return new String("signup");
    }
    @GetMapping("/login")
    public String loginPage() {
        return new String("login");
    }
    

}
