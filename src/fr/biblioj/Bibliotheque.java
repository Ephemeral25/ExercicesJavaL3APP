package fr.biblioj;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Ouvrage> ouvrages = new ArrayList<>();
    private List<Abonne> abonnes = new ArrayList<>();

    public void emprunter(Ouvrage ouvrage, Abonne abonne) {
        abonne.addEmprunt(ouvrage);
        abonne.addReservation(ouvrage);
        ouvrage.setDispo(false);
        ouvrage.setEmprunteur(abonne);
        System.out.println("L'ouvrage " + ouvrage.getTitre() + "a été emprunté par " + abonne.getNom());
    }

    public void reserver(Ouvrage ouvrage) {
        ouvrage.setEstReserve(true);
        ouvrage.setDispo(false);
    }

    public void restituer(Ouvrage ouvrage, Abonne abonne) {
        ouvrage.setEmprunteur(null);
        ouvrage.setDispo(true);
        abonne.restitution(ouvrage);
    }

    public void addOuvrage(Ouvrage ouvrage) {
        ouvrages.add(ouvrage);
    }

    public void addAbonne(Abonne abonne) {
        abonnes.add(abonne);
    }

    public void afficherOuvragesDisponibles() {
        System.out.println("\nListe des ouvrages disponibles : ");
        for(Ouvrage ouvrage : ouvrages)
            if(ouvrage.isDispo() && !ouvrage.isEstReserve())
                System.out.println("\t- '" + ouvrage.getTitre() + "' ");
    }

    public void afficherOuvragesEmprunts() {
        System.out.println("\nListe des ouvrages empruntés : ");
        for(Ouvrage ouvrage : ouvrages)
            if(!ouvrage.isDispo())
                System.out.println("\t- '" + ouvrage.getTitre() + "' ");
    }

    public void afficherOuvragesReserves() {
        System.out.println("\nListe des ouvrages réservés : ");
        for(Ouvrage ouvrage : ouvrages)
            if(ouvrage.isEstReserve())
                System.out.println("\t- '" + ouvrage.getTitre() + "' ");
    }

    public void infosOuvragesDisponibles() {
        System.out.println("\nListe des ouvrages disponibles : ");
        for(Ouvrage ouvrage : ouvrages)
            if(!ouvrage.isEstReserve() && ouvrage.isDispo())
                System.out.println("\t-" + ouvrage);
    }

    public void afficherAbonnesActifs() {
        System.out.println("\nListe des abonnés actifs :");
        for(Abonne abonne : abonnes)
            if(abonne.getEmprunts().size() != 0 || abonne.getReservation().size() != 0)
                System.out.println("\t-" + abonne.getNom());
    }

    public void afficherAbonnesPassifs() {
        System.out.println("\nListe des abonnés inactifs : ");
        for(Abonne abonne : abonnes)
            if(abonne.getEmprunts().size() == 0 && abonne.getReservation().size() == 0)
                System.out.println("\t-" + abonne.getNom());
    }

    public void afficherAbonnes() {
        System.out.println("\nListe des abonnés :");
        for(Abonne abonne : abonnes) {
            System.out.println("\t-" + abonne.getNom());
        }
    }
}
