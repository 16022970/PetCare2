package com.example.a16022970.petcare2;

import java.io.Serializable;

public class Pets {
    static String[] nameArray = {"Cupcake", "Donut"};
    static String[] breedArray = {"1.5", "1.6"};

    String name;
    String breed;

    public Pets(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //    private  int id;
//    private String name;
//    private String breed;
////    private String dob;
////    private byte[] image;
//    private String xtra;
//
//    public Pets(String name, String breed, String xtra, int id) {
//        this.name = name;
//        this.breed = breed;
////        this.dob = dob;
////        this.image = image;
//        this.xtra = xtra;
//        this.id = id;
//    }
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }

//    public String getDob() {
//        return dob;
//    }
//
//    public void setDob(String dob) {
//        this.dob = dob;
//    }
//
//    public byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

//    public String getXtra() {
//        return xtra;
//    }
//
//    public void setXtra(String xtra) {
//        this.xtra = xtra;
//    }
}
