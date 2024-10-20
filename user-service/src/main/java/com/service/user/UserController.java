package com.service.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  private final List<User> users = new ArrayList<>();

  @GetMapping
  public List<User> getUsers() {
    return users;
  }

  @GetMapping("/{id}")
  public User getUser(@PathVariable int id) {
    return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
  }

  @PostMapping
  public User createUser(@RequestBody User user) {
    users.add(user);
    return user;
  }
}
