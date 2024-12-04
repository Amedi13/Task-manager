package com.example.taskmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    /**
     * Set Id
     * @param id
     */
    public void setID(Long id){
        this.id = id; 
    }

    /**
     * Get ID
     */
    public Long getID(){
        return id; 
    }

    /**
     * Set Name
     * @param name
     */
    public void setName(String name){
        this.name = name; 
    }

    /**
     * Get name
     */
    public String getName(){
        return name; 
    }

    /**
     * Set Email
     * @param email
     */
    public void setEmail(String email){
        this.email = email; 
    }

    /**
     * Get Email
     */
    public String getEmail(){
        return email; 
    }

    /**
     * Set password
     @param password
     */
    public void setPassword(String password){
        this.password = password; 
    }

    /**
     * Get password
     */
    public String getPassword(){
        return password; 
    }


}

