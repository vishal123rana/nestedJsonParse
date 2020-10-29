package com.example.nestedJsonParse.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProfileInfo")
public class ProfileInfo {


    private String gender;

    private String married;

    private String source;
    public ProfileInfo(){

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getMarried() {
        return married;
    }


    public void setMarried(String married) {
        this.married = married;
    }

    public String getSource() {
        return source;
    }


    public void setSource(String source) {
        this.source = source;
    }

}