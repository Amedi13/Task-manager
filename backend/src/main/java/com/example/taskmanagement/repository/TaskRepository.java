package com.example.taskmanagement.repository;
import com.example.taskmanagement.model.task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<task, Long>{
    
    /**
     * All this interface needs it to extend
     * the Jpa Repository
     */
}
