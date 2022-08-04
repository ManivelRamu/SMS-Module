package com.java.usermanagement.controller;

import com.java.usermanagement.entity.Member_Type;
import com.java.usermanagement.entity.Sub_Type;
import com.java.usermanagement.service.Sub_Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Sub_Type_Controller {
    @Autowired
    private Sub_Type_Service service;
    @PostMapping("/sub/add")
    public Sub_Type addsub(@RequestBody Sub_Type subscription){
        return service.add(subscription);
    }
    @GetMapping("/sub/get")
    public List<Sub_Type>getsubs(){
        return service.get();
    }
    @GetMapping("/sub/{id}")
    public Sub_Type getsubsbyid(@PathVariable int id){
        return service.getById(id);
    }
    @PutMapping("/sub/update")
    public Sub_Type updatesub(@RequestBody Sub_Type subs){
        return service.update(subs);
    }
    @DeleteMapping("/sub/delete/{id}")
    public String deletesubs(@ PathVariable int id){
        return service.deleteById(id);
    }


}
//








