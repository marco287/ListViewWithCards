package com.example.listviewwithcards;


public class Donnee {
    private String nom;
    private int taille;
    private int image;

    Donnee (String text1, int text2, int image1){
       nom = text1;
       taille = text2;
        image = image1;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }
    public int getImage() {
        return image;
    }

}