import fr.biblioj.BiblioJ;
import fr.calculpaye.EntrepriseJ;
import fr.comptebancaire.CompteEpargne;
import fr.gravite.Bonjour;
import fr.gravite.CalculateurChute;
import fr.parcattraction.ParcAttraction;
import fr.parcattraction.Tarif;
import fr.sallecinema.SalleCinema;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            //Exercice 1.1
            System.out.println("Exercice 1.1 : Bonjour <user> !\n");
            ArrayList<String> names = new ArrayList<>();
            names.add("Pascal");
            names.add("Michelle");
            names.add("Jérôme");

            Bonjour welcomer = new Bonjour();
            welcomer.printNames(names);
            System.out.print("\n\n");

            //Exercice 1.2
            System.out.println("\nExercice 1.2 : Gravité calculateur de chute\n");

            CalculateurChute fall = new CalculateurChute(10, -9.81);
            System.out.println("Position avant chute : " + fall.getPositionInitiale()
                    +"\nPosition après chute : " + fall.positionApresChute(0, 0));
            System.out.println("\n\n");

            //Exercice 2
            System.out.println("Exercice 2 : Salle de cinéma\n");

            SalleCinema cine = new SalleCinema("The place beyond the pines", 200, 9);

            for(int i = 0; i < 100; i++) {
                cine.vendrePlace();
            }

            System.out.println(cine);
            System.out.println("\n\n");

            //Exercice 3
            System.out.println("Exercice 3 : Calcul de paye\n");

            EntrepriseJ ent = new EntrepriseJ();

            try{
                ent.main();
            } catch(final IllegalArgumentException ae) {
                System.err.println(ae.getMessage());
                ae.printStackTrace();
            } catch(final Exception e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println("\n\n");

            //Exercice 4
            System.out.println("Exercice 4 : BiblioJ");

            BiblioJ biblio = new BiblioJ();
            biblio.main();

            System.out.println("\n\n");

            //Exercice 5
            System.out.println("Exercice 5 : Parc d'Attraction");

            ParcAttraction parc = new ParcAttraction("DisneilleLand", 12000, 48.5);

            parc.vendreBillets(230, Tarif.Tarifs.réduit);
            parc.vendreBillets(187, Tarif.Tarifs.illimité);
            parc.vendreBillets(1453, Tarif.Tarifs.illimité5);
            parc.vendreBillets(834, Tarif.Tarifs.réduit5);
            System.out.println(parc);

            System.out.println("\n\n");

            //Exercice 6
            System.out.println("Exercice 5 : Comptes Bancaires");

            CompteEpargne cpt = new CompteEpargne(12222,22, 30);
            System.out.println(cpt);

        }
    }
