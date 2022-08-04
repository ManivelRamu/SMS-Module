package com.java.usermanagement.controller;

import com.java.usermanagement.entity.Subscription_Details_Info;
import com.java.usermanagement.entity.User_Info;
import com.java.usermanagement.service.Subscription_Details_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Subscription_Details_Info_Controller {
@Autowired
    private Subscription_Details_Info_Service service;

    @PostMapping("/details/add")
    public Subscription_Details_Info adddetails(@RequestBody Subscription_Details_Info ids){
        return service.add(ids);
    }
    @GetMapping("/details/ids")
    public List<Subscription_Details_Info>all(){
        return service.get();
    }
    @GetMapping("/details/{id}")
    public Subscription_Details_Info getdetailsById(@PathVariable int id){
        return service.getById(id);
    }
    @DeleteMapping("/deletedetails/{id}")
    public String deleteDetails(int id){
        return service.deleteById(id);
    }


}
