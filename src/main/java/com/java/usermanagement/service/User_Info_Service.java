package com.java.usermanagement.service;

import com.java.usermanagement.entity.User_Info;
import com.java.usermanagement.repository.User_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Info_Service {
    @Autowired
    private User_Info_Repository repository;

    public User_Info addUser(User_Info user){
        return repository.save(user);
    }
    public List<User_Info> getUser(){
        return repository.findAll();
    }
    public User_Info getbyid(int id){
        return repository.findById(id).orElse(null);
    }
    public User_Info getbyname(String name){
        return repository.findByName(name);
    }
    public String deleteuser(int id){
        repository.deleteById(id);
        return "User deleted"+id;
    }
    public User_Info updateuser(User_Info user){
        User_Info existing=repository.findById(user.getUser_id()).orElse(null);
        assert existing != null;
        existing.setName(user.getName());
        existing.setLocation(user.getLocation());
        return repository.save(existing);
    }
}
