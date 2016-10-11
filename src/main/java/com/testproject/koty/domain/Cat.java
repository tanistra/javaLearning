package com.testproject.koty.domain;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by jtanistra on 2016-10-05.
 */


public class Cat {

    private String catName;
    private Date birthDate;
    private Float catWeight;
    private String gardian;

    public String przedstawSie(){
        return "Cześć, jestem: " + catName + " , urodziłem się: " + birthDate + ", ważę " + catWeight + " a opiekuje się mną " + gardian;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Date getBirthDate() { return birthDate; }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Float getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(Float catWeight) {
        this.catWeight = catWeight;
    }

    public String getGardian() {
        return gardian;
    }

    public void setGardian(String gardian) {
        this.gardian = gardian;
    }

}


