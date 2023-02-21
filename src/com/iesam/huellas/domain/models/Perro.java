package com.iesam.huellas.domain.models;

public class Perro extends  Animal{
    private String breed;
    private Boolean friendly;

    //Funciones

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getFriendly() {
        return friendly;
    }

    public void setFriendly(Boolean friendly) {
        this.friendly = friendly;
    }
}
