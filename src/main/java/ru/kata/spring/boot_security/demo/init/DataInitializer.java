package ru.kata.spring.boot_security.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.RoleRepository;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.Optional;

// @Component
// public class DataInitializer implements CommandLineRunner {
//
//     @Autowired
//     private UserRepository userRepository;
//
//     @Autowired
//     private RoleRepository roleRepository;
//
//     @Autowired
//     PasswordEncoder passwordEncoder;
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Initializing data...");
//
//        // Создание ролей
//        Role adminRole = new Role();
//        adminRole.setName("ROLE_ADMIN");
//        Role userRole = new Role();
//        userRole.setName("ROLE_USER");
//
//        // Сохраняем роли в базе данных
//        if (roleRepository.findByName(adminRole.getName()) == null) {
//            adminRole = roleRepository.save(adminRole);
//        } else {
//            Optional<Role> existingAdminRole = roleRepository.findByName(adminRole.getName());
//            adminRole = existingAdminRole.orElse(adminRole);
//        }

//        if (roleRepository.findByName(userRole.getName()) == null) {
//            userRole = roleRepository.save(userRole);
//        } else {
//            Optional<Role> existingUserRole = roleRepository.findByName(userRole.getName());
//            userRole = existingUserRole.orElse(userRole);
//        }
//
//        // Создание пользователей
//        if (!userRepository.existsByUsername("admin")) {
//            System.out.println("Creating admin user...");
//            User admin = new User();
//            admin.setUsername("admin");
//            admin.setPassword(passwordEncoder.encode("admin"));
//            admin.getRoles().add(adminRole);
//            userRepository.save(admin);
//        }

//        if (!userRepository.existsByUsername("user")) {
//            System.out.println("Creating user...");
//            User user = new User();
//            user.setUsername("user");
//            user.setPassword(passwordEncoder.encode("user"));
//            user.getRoles().add(userRole);
//            userRepository.save(user);
//        }
//    }
//}
