package fr.comptebancaire.modeles;

abstract public class CompteSansLimite {
    private long plafond;
    private boolean actif;

    public long getPlafond() {
        return plafond;
    }

    public void setPlafond(long plafond) {
        this.plafond = plafond;
    }
}
