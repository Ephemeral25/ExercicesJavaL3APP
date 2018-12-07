package fr.comptebancaire.modeles;

abstract public class CompteAvecLimite {
    private final long plafond;
    private boolean actif;


    public CompteAvecLimite(long plafond) {
        this.plafond = plafond;
    }

    public long getPlafond() {
        return plafond;
    }
}
