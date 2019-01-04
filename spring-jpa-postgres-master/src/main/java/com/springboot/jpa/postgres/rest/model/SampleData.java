//package com.springboot.jpa.postgres.rest.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "SampleData")
//public class SampleData{
//    @Id
//    @GeneratedValue(generator = "SampleData_generator")
//    @SequenceGenerator(
//            name = "SampleData_generator",
//            sequenceName = "SampleData_sequence",
//            initialValue = 100
//    )
//    private Long id;
//
//    @Column(columnDefinition = "label")
//    private String label;
//    
//    @Column(columnDefinition = "value")
//    private int value;
//    
//    @Column(columnDefinition = "userid")
//    private String userid;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//    
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//    
//    public String getUserid() {
//        return userid;
//    }
//
//    public void setUserid(String userid) {
//        this.userid = userid;
//    }
//
//}
