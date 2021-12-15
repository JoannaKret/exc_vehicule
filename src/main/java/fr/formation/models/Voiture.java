package fr.formation.models;

import org.springframework.stereotype.Component;

@Component
public class Voiture extends Vehicule {

    public Voiture() {

    }

    @Override
    public String toString() {
        return "Voiture est un " + super.toString();
    }
}
