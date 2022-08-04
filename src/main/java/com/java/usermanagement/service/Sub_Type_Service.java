package com.java.usermanagement.service;

import com.java.usermanagement.entity.Member_Type;
import com.java.usermanagement.entity.Sub_Type;
import com.java.usermanagement.repository.Sub_Type_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sub_Type_Service {
    @Autowired
    private Sub_Type_Repository repository;
//addone
    public Sub_Type add(Sub_Type type){
        return repository.save(type);
    }

    //getall
    public List<Sub_Type> get(){
        return repository.findAll();
    }
    //fingbyid
    public Sub_Type getById(int id){
        return repository.findById(id).orElse(null);
    }
    //delete
    public String deleteById(int id){
        repository.deleteById(id);
        return "Member details deleted";
    }
    //update
    public Sub_Type update(Sub_Type update){
        Sub_Type existingsub=repository.findById(update.getSub_type_id()).get();
        existingsub.setSub_type(update.getSub_type());
        existingsub.setDuration(update.getDuration());
        return repository.save(existingsub);
    }
//    public Member_Type update (Member_Type update){
//        Member_Type exist=repository.findById(update.getMem_type_id()).get();
//        exist.setMem_type_name(update.getMem_type_name());
//        return repository.save(exist);
//    }





}
//