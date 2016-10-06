package com.testproject.bazakotow.model;

import java.util.Date;

/**
 * Created by jtanistra on 2016-10-05.
 */



public class Cat {

    public String getCatName() {
        return catName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Float getCatWeight() {
        return catWeight;
    }

    public String getGardian() {
        return gardian;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCatWeight(Float catWeight) {
        this.catWeight = catWeight;
    }

    public void setGardian(String gardian) {
        this.gardian = gardian;
    }

    private String catName;
    private Date birthDate;
    private Float catWeight;
    private String gardian;

    public void main(){
        Cat cat = new Cat();
        Date now = new Date();
    }


    public String przedstawSie(){
        return "Cześć, jestem: " + catName + " , urodziłem się: " + birthDate + ", ważę " + catWeight + " a opiekuje się mną " + gardian;
    }
}


