package com.java.usermanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subscripition_info")

public class Subscripition_Info {


    @Id
    private int sub_det_id;
//    @GeneratedValue
//    private int Id;
    private String sub_details;

}
