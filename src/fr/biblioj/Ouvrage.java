package fr.biblioj;

import java.util.Objects;

public class Ouvrage {
    private String titre;
    public enum SupportMedia {papier, CD, DVD, cléUSB};
    private SupportMedia media;
    private int anneeEdition;
    private boolean dispo;
    private boolean estReserve;
    private Abonne emprunteur;

    public Ouvrage(String titre, int anneeEdition, SupportMedia media) {
        this.titre = titre;
        this.anneeEdition = anneeEdition;
        this.media = media;
        this.dispo = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeEdition() {
        return anneeEdition;
    }

    public void setAnneeEdition(int anneeEdition) {
        this.anneeEdition = anneeEdition;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public boolean isEstReserve() {
        return estReserve;
    }

    public void setEstReserve(boolean estReserve) {
        this.estReserve = estReserve;
    }

    public Abonne getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Abonne emprunteur) {
        this.emprunteur = emprunteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ouvrage ouvrage = (Ouvrage) o;
        return anneeEdition == ouvrage.anneeEdition &&
                dispo == ouvrage.dispo &&
                estReserve == ouvrage.estReserve &&
                Objects.equals(titre, ouvrage.titre) &&
                media == ouvrage.media &&
                Objects.equals(emprunteur, ouvrage.emprunteur);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("titre='").append(titre).append('\'');
        sb.append(", anneeEdition=").append(anneeEdition);
        return sb.toString();
    }
}