package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    @GetMapping("/user")
    public String homePage() {
        return "home";
    }

    // @GetMapping("/authenticated")
    // public String pageForAuthenticatedUsers(Principal principal) {
    //     return "secured part of web service " + principal.getName();
    // }

//     @GetMapping("/")
//     public String index() {
//         return "index"; // имя файла index.html
//     }
//
//     @GetMapping("/user")
//     public String user() {
//         return "user"; // имя файла user.html
//     }
//
//     @GetMapping("/admin")
//     public String admin() {
//         return "admin"; // имя файла admin.html
//     }
}
