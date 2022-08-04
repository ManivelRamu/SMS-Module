package com.java.usermanagement.controller;

import com.java.usermanagement.entity.User_Info;
import com.java.usermanagement.service.User_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class User_Info_Controller {
    @Autowired
    private User_Info_Service service;
    @PostMapping("/adduser")
    public User_Info addUser(@RequestBody User_Info user){
        return service.addUser(user);
    }
    @GetMapping("/users")
    public List<User_Info> getuser(){
        return service.getUser();
    }
    @GetMapping("/user/id/{id}")
    public User_Info getUserById(@PathVariable int id){
        return service.getbyid(id);
    }

    @GetMapping("/user/name/{name}")
    public User_Info getUserByName(@PathVariable String name){
        return service.getbyname(name);
    }

    @PutMapping("/updateuser")
    public User_Info updateuser(@RequestBody User_Info user){
        return service.updateuser(user);
    }
    @DeleteMapping("/deleteuser/{id}")
    public String deleteProduct(int id){
        return service.deleteuser(id);
    }
}
