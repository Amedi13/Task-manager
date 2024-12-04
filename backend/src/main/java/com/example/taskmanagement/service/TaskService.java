package com.example.taskmanagement.service;

import com.example.taskmanagement.model.task;
import com.example.taskmanagement.model.task;
import com.example.taskmanagement.repository.TaskRepository;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    
    // task servie object
    private TaskRepository taskRepository; 

    /**
     * Set the task Repository
     * @param taskRposiory
     */
    public void setTaskRepository(TaskRepository taskRepository){
        this.taskRepository = taskRepository; 
    }

    /**
     * List to get all task 
     * @return taskRepository 
     */
    public List<task> getAllTask() {
        return taskRepository.findAll(); 
    }

    /**
     * Create a task
     * @return task
     */
    public task createTask(task task){
        return taskRepository.save(task);
    }
     /**
      * Update Task
      * @param id
      * @param task
      * @return
      */
    public task updateTask(Long id, task task) {
        task existingTask = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
        existingTask.setPriority(task.getPriority());
        existingTask.setStatus(task.getStatus());
        return taskRepository.save(existingTask);
    }

    /**
     * Delete a task 
     */
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
