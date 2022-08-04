package com.java.usermanagement.controller;

import com.java.usermanagement.entity.Subscripition_Info;
import com.java.usermanagement.service.Subscripition_Info_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Subscripition_Info_Controller {
    @Autowired
    private Subscripition_Info_Service service;

    @PostMapping("/add")
    public Subscripition_Info add(@RequestBody Subscripition_Info s_i){
        return service.add(s_i);
    }



    @GetMapping("/get")
    public List<Subscripition_Info>get(){
        return service.get();
    }


    @GetMapping("/get/{id}")
    public  Subscripition_Info findById(@PathVariable int id){
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return service.deleteById(id);
    }
    @PutMapping("/update/{id}")
        public Subscripition_Info update(@RequestBody Subscripition_Info id){
        return service.update(id);
    }



}
