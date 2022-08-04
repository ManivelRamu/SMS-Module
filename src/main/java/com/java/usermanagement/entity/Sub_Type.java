package com.java.usermanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="subscripition_type" )
public class Sub_Type {
    @Id
//    @ManyToMany(mappedBy = "type",fetch = FetchType.LAZY)
//    @JsonIgnoreProperties(value = "type")
    private int sub_type_id;
    private String sub_type;
    private String duration;
}
//@OneToMany(mappedBy = "info", fetch = FetchType.LAZY)
//	@JsonIgnoreProperties(value = "info")
//	private List<SubscriptionFeaturesDetails> features;