package com.iesam.huellas.domain.models;

public class Adopcion {
    private String id;
    private String date;
    private Adoptante adopter;
    private Animal adopted;

    //Funciones

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Adoptante getAdopter() {
        return adopter;
    }

    public void setAdopter(Adoptante adopter) {
        this.adopter = adopter;
    }

    public Animal getAdopted() {
        return adopted;
    }

    public void setAdopted(Animal adopted) {
        this.adopted = adopted;
    }
}
