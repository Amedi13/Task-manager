package com.example.taskmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class task {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; 

    private String title; 
    private String description; 
    private String status;
    private String priority; 


    /**
     * Set title
     * @param title
     */
    public void setTitle(String title){
      this.title = title; 
    }
    
    /**
     * Get Title
     */
    public String getTitle(){
      return title; 
    }

    /**
     * Set Id
     * @param id
     */
    public void setID(Long id){
      this.id = id; 
    }

    /**
     * Get Id
     */
    public Long getID(){
      return id; 
    }

    /**
     * Set Description.
     * @param description 
     */
    public void setDescription(String description) {
      this.description  = description; 
    }

    /**
     * Get Decription 
     */
    public String getDescription() {
      return description; 
    }

    /**
     * Set Status
     * @param status
     */
    public void setStatus(String status){
      this.status = status; 
    }

    /**
     * Get Status
     */
    public String getStatus(){
      return status; 
    }

    /**
     * Set Priority
     * @param priority
     */
    public void setPrioirty(String priority){
      this.priority = priority; 
    } 

    /**
     * Get Priority
     */
    public String getPrioirty(){
      return priority; 
    }
}
