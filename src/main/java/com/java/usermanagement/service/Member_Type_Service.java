package com.java.usermanagement.service;

import com.java.usermanagement.entity.Member_Type;
import com.java.usermanagement.repository.Member_Type_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Member_Type_Service {
    @Autowired
    private Member_Type_Repository repository;

    //addOne
    public Member_Type add(Member_Type details){
        return repository.save(details);
    }
    //getall
    public List<Member_Type> get(){
        return repository.findAll();
    }
    //fingbyid
    public Member_Type getById(int id){
        return repository.findById(id).orElse(null);
    }
    //delete
    public String deleteById(int id){
        repository.deleteById(id);
        return "Member details deleted";
    }
    //update
    public Member_Type update (Member_Type update){
        Member_Type exist=repository.findById(update.getMem_type_id()).get();
        exist.setMem_type_name(update.getMem_type_name());
        return repository.save(exist);
    }
}







