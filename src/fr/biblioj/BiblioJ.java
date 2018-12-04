package fr.biblioj;

import javax.print.attribute.standard.Media;

public class BiblioJ {

    public void main() {
        Bibliotheque biblio = new Bibliotheque();

        //On créé nos abonnés
        Abonne abo1 = new Abonne("Jacques", "32 rue de la Bastille");
        Abonne abo2 = new Abonne("Pedro", "2bis sentier de la Paix");
        Abonne abo3 = new Abonne("Marine", "17 boulevard Haussman");
        Abonne abo4 = new Abonne("Mireille", "71 impasse de la Croix");
        //On créé nos ouvrages
        Ouvrage ouv1 = new Ouvrage("Fondations : l'Empire", 1996, Ouvrage.SupportMedia.papier);
        Ouvrage ouv2 = new Ouvrage("Un chemin, une vie", 2013, Ouvrage.SupportMedia.DVD);
        Ouvrage ouv3 = new Ouvrage("La tartes aux pommes : La recette", 2004, Ouvrage.SupportMedia.cléUSB);
        Ouvrage ouv4 = new Ouvrage("The missing stranger", 1978, Ouvrage.SupportMedia.DVD);
        Ouvrage ouv5 = new Ouvrage("Gérer le stress en 3 étapes simples", 2018, Ouvrage.SupportMedia.papier);
        Ouvrage ouv6 = new Ouvrage("GitHub pour les nuls", 2016, Ouvrage.SupportMedia.cléUSB);

        biblio.addAbonne(abo1);
        biblio.addAbonne(abo2);
        biblio.addAbonne(abo3);
        biblio.addAbonne(abo4);

        biblio.addOuvrage(ouv1);
        biblio.addOuvrage(ouv2);
        biblio.addOuvrage(ouv3);
        biblio.addOuvrage(ouv4);
        biblio.addOuvrage(ouv5);
        biblio.addOuvrage(ouv6);

        biblio.emprunter(ouv1, abo1);




        biblio.afficherOuvragesDisponibles();
        biblio.afficherAbonnes();
        biblio.infosOuvragesDisponibles();
    }
}
