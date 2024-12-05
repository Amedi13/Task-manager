package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.Task;
import com.example.taskmanagement.service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks") // Changed to plural for better RESTful convention
public class TaskController {

    private final TaskService taskService;

    // Constructor for dependency injection
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * Gets all tasks.
     * 
     * @return List of tasks
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTask();
    }

    /**
     * Creates a new task.
     * 
     * @param task Task to be created
     * @return Created task
     */
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    /**
     * Updates an existing task.
     * 
     * @param id   Task ID to be updated
     * @param task Updated task details
     * @return Updated task
     */
    @PutMapping("/{id}") // Fixed path variable
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    /**
     * Deletes a task by ID.
     * 
     * @param id Task ID to be deleted
     */
    @DeleteMapping("/{id}") // Fixed path variable
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}

