package com.park.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String start(Model model) {
        //model.addAttribute("userForm", new User());
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        //model.addAttribute("userForm", new User());
        return "login";
    }

    @GetMapping("/find_id")
    public String find_id(Model model) {
        //model.addAttribute("userForm", new User());
        return "find_id";
    }

    @GetMapping("/find_password")
    public String find_password(Model model) {
        //model.addAttribute("userForm", new User());
        return "find_password";
    }

    @GetMapping("/notice")
    public String notice(Model model) {
        //model.addAttribute("userForm", new User());
        return "notice";
    }

    @GetMapping("/register")
    public String register(Model model) {
        //model.addAttribute("userForm", new User());
        return "register";
    }

    @GetMapping("/schedule")
    public String schedule(Model model) {
        //model.addAttribute("userForm", new User());
        return "schedule";
    }

    @GetMapping("/storage")
    public String storage(Model model) {
        //model.addAttribute("userForm", new User());
        return "storage";
    }

    @GetMapping("/teamchat")
    public String teamchat(Model model) {
        //model.addAttribute("userForm", new User());
        return "teamchat";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        //model.addAttribute("userForm", new User());
        return "welcome";
    }

    @GetMapping("/project_home")
    public String project(Model model) {
        //model.addAttribute("userForm", new User());
        return "project_home";
    }
}
