package com.java.usermanagement.service;

import com.java.usermanagement.entity.Subscripition_Info;
import com.java.usermanagement.entity.Subscription_Details_Info;
import com.java.usermanagement.repository.Subscripition_Details_Info_Repository;
import com.java.usermanagement.repository.Subscripition_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Subscription_Details_Info_Service {
    @Autowired
private Subscripition_Details_Info_Repository repository;

    //addOne
    public Subscription_Details_Info add(Subscription_Details_Info details){
        return repository.save(details);
    }
    //getall
    public List<Subscription_Details_Info> get(){
        return repository.findAll();
    }
    //fingbyid
     public Subscription_Details_Info getById(int id){
           return repository.findById(id).orElse(null);
    }
    //delete
    public String deleteById(int id){
        repository.deleteById(id);
        return "Id deleted";
    }





}
