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
@Table(name="subscripition_details_info")

public class Subscription_Details_Info {
    @Id
    private int sub_det_info_id;
    private int subs_det_id;//fk for table 1
    private int mem_id_key;//fk for table 3
}
