package com.java.usermanagement.service;

import com.java.usermanagement.entity.Subscripition_Info;
import com.java.usermanagement.repository.Subscripition_Info_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class Subscripition_Info_Service {
    @Autowired
    private Subscripition_Info_Repository repository;

//    addone
    public Subscripition_Info add(Subscripition_Info s_i){
         return repository.save(s_i);
    }


//  getall
    public List<Subscripition_Info> get(){
        return repository.findAll();
    }

    //fingbyid
    public Subscripition_Info getById(int id){
        return repository.findById(id).orElse(null);
    }
    //delete
    public String deleteById(int id){
        repository.deleteById(id);
       return "Id deleted";
    }
    //update
    public Subscripition_Info update(Subscripition_Info upd){
        Subscripition_Info existing=repository.findById(upd.getSub_det_id()).get();
        existing.setSub_details(upd.getSub_details());
        return repository.save(existing);
    }
}