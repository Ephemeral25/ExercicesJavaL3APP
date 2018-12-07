package fr.comptebancaire;

abstract public class CompteAvecLimite {
    private final long plafond;

    CompteAvecLimite(long plafond) {
        this.plafond = plafond;
    }

    public long getPlafond() {
        return plafond;
    }
}
