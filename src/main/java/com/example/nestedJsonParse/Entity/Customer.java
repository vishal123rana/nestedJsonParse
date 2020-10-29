package com.example.nestedJsonParse.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "Customer")
public class Customer {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Integer age;

    private List<String> projects;
    @DBRef
    private Address address;
    private List<String> paymentMethods;
    @DBRef
    private ProfileInfo profileInfo;
    public Customer(){
        projects = new ArrayList<>();
        paymentMethods = new ArrayList<>();
    }

    public Customer(Integer id, String name, String email, String phone, Integer age, List<String> projects, Address address, List<String> paymentMethods, ProfileInfo profileInfo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.projects = projects;
        this.address = address;
        this.paymentMethods = paymentMethods;
        this.profileInfo = profileInfo;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getProjects() {
        return projects;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    public ProfileInfo getProfileInfo() {
        return profileInfo;
    }
}