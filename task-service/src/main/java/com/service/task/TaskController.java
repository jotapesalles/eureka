package com.service.task;

import jakarta.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

  private final List<Task> tasks = new ArrayList<>();

  @GetMapping
  public List<Task> getTasks() {
    return tasks;
  }

  @GetMapping("/{id}")
  public Task getTask(@PathVariable int id) {
    return findTaskById(id).orElseThrow(() -> new NotFoundException("Task not found"));
  }

  @PostMapping
  public Task createTask(@RequestBody Task task) {
    tasks.add(task);
    return task;
  }

  @PutMapping("/{id}/finish")
  public Task finishTask(@PathVariable int id) {
    return findTaskById(id)
        .map(
            task -> {
              task.setDone(true);
              return task;
            })
        .orElseThrow(() -> new NotFoundException("Task not found"));
  }

  private Optional<Task> findTaskById(int id) {
    return tasks.stream().filter(task -> task.getId() == id).findFirst();
  }
}
