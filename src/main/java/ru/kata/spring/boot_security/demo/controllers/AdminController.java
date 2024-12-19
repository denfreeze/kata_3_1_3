package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.allUsers());
        return "users";
    }

    @GetMapping(value = "/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "newUser";
    }

    @PostMapping(value = "/new")
    public String createUser(@ModelAttribute User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping(value = "/edit")
    public String edit(@RequestParam(value = "id") long id, Model model) {
        model.addAttribute("user", userService.getOne(id));
        return "editUser";
    }

    @PostMapping(value = "/update")
    public String update(@ModelAttribute("user") User user, @RequestParam("id") Long id) {
        userService.updateUser(id, user);
        return "redirect:/";
    }

    @GetMapping(value = "/delete")
    public String delete(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
