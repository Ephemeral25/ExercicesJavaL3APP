package fr.comptebancaire.modeles;

abstract public class CompteAvecLimite {
    private final long plafond;
    private boolean actif;
    protected boolean ouvert = true;


    public CompteAvecLimite(long plafond) {
        this.plafond = plafond;
    }

    public long getPlafond() {
        return plafond;
    }
}
