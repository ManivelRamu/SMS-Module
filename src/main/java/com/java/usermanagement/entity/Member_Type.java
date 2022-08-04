package com.java.usermanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="member_type" )
public class Member_Type {
    @Id
    private int mem_type_id;//fk for 2 tables-sub_det,user_info
    private String mem_type_name;
}
