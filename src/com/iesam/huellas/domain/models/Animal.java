package com.iesam.huellas.domain.models;

public class Animal {
    private String id;
    private String bidthdate;
    private String name;
    private String gender;

    //Funciones


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBidthdate() {
        return bidthdate;
    }

    public void setBidthdate(String bidthdate) {
        this.bidthdate = bidthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
