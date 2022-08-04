package com.java.usermanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_info")

public class User_Info {
    @Id
private int user_id;//pk
private int mem_type_id;//fk from member type
private int sub_type_id;//fk from subscription type
private String name;
private String email;
private String location;
@ManyToMany
    @JoinColumn(name="sub_type_id")
    private Sub_Type type;

}
//@OneToOne
//	@JoinColumn(name = "subscription_id")
//	private SubscriptionInfo info;