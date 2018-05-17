package com.gaozhaoxi.springbooteleven.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.websocket.ClientEndpoint;

/**
 * @author Leon
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String address;

    public Person(){

    }
    public Person(Long id){
        this.id=id;
    }
    public Person(Long id,String name,Integer age,String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
