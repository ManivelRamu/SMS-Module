package com.java.usermanagement.controller;

import com.java.usermanagement.entity.Member_Type;
import com.java.usermanagement.entity.User_Info;
import com.java.usermanagement.service.Member_Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Member_Type_Controller {
    @Autowired
private Member_Type_Service service;
    @PostMapping("/member/add")
    public Member_Type addmember(@RequestBody Member_Type member){
        return service.add(member);
    }
    @GetMapping("/member/get")
    public List<Member_Type>getmember(){
        return service.get();
    }
    @GetMapping("/member/{id}")
    public Member_Type getMemberById(@PathVariable int id){
    return service.getById(id);
    }
    @PutMapping("/member/update")
    public Member_Type updateMember(@RequestBody Member_Type member){
        return service.update(member);
    }
    @DeleteMapping("/member/delete/{id}")
    public String deleteMember(int id){
        return service.deleteById(id);
    }

}

