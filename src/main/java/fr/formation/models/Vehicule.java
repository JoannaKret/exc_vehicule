package fr.formation.models;


import org.springframework.stereotype.Component;


public class Vehicule {

    private String couleur;
    private float poids;

    public Vehicule () {

    }
    public Vehicule(String couleur, float poid) {
        this.couleur = couleur;
        this.poids = poid;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "vehicule de la couleur " + couleur + " qui pèse " + poids + " kg.";
    }
}
