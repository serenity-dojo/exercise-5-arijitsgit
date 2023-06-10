package com.serenitydojo;

public class Hamster extends Pet{
    public Hamster(String name, String favoriteToy,int age) {
        super(name, age);
    }

    public String favoriteGame;

    public String play(){
        return "runs in wheel";
    }

}
