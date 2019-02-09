package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

//  @Autowired
//  UserRepository userRepository;
//
//  @Autowired
//  RoleRepository roleRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public void run(String... strings) throws Exception {
//    System.out.println("Loading data . . .");
//
//    roleRepository.save(new Role("USER"));
//    roleRepository.save(new Role("ADMIN"));
//
//    Role adminRole = roleRepository.findByRole("ADMIN");
//    Role userRole = roleRepository.findByRole("USER");

//    User user = new User("bob@bob.com","bob","Bob",
//            "Bobberson", true, "bob");
//    user.setRoles(Arrays.asList(userRole));
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    userRepository.save(user);
//
//    user = new User("jim@jim.com","jim","Jim",
//            "Jimmerson", true, "jim");
//    user.setRoles(Arrays.asList(userRole));
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    userRepository.save(user);

//    User user = new User("admin@secure.com","password",
//            "Admin","User", true, "admin");
//    user.setRoles(Arrays.asList(adminRole));
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    userRepository.save(user);

//    user = new User("sam@every.com","password","Sam",
//            "Everyman", true, "everyman");
//    user.setRoles(Arrays.asList(userRole, adminRole));
//    user.setPassword(passwordEncoder.encode(user.getPassword()));
//    userRepository.save(user);
  }
}