package fr.parcattraction;

import java.util.ArrayList;
import java.util.List;

//Exercice 5
public class Tarif {
    public enum Tarifs {illimité, illimité5, réduit, réduit5};
    private Tarifs tarif;

    public Tarifs getTarif() {
        return tarif;
    }

    public void setTarif(Tarifs tarif) {
        this.tarif = tarif;
    }
}
