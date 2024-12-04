package com.example.taskmanagement.controller;

import com.example.taskmanagement.model.task;
import com.example.taskmanagement.service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/task")
public class TaskController {
    // task service obeject
    private TaskService taskService; 

    //constructor 
    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService; 
    }

    /**
     * Gets all the task
     * @return task
     */
    @GetMapping
    public List<task> getAllTask(){
        return taskService.getAllTask(); 
    }

    /**
     * Create new Task
     * @pram task
     * @return task
     */
    @PostMapping
    public task createTask(@RequestBody task task){
        return taskService.createTask(task);
    }
    
    /**
     * Update an existing task
     * @param id
     * @param task
     * @return id, task
     */
    @PutMapping("/id")
    public task updateTask(@PathVariable Long id, @RequestBody task task){
        return taskService.updateTask(id, task); 
    }

    /**
     * Delete a Task
     * @param id
     */
    @DeleteMapping("/id")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
    
    
}
