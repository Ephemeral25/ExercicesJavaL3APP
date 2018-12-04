package fr.parcattraction;

//Exercice 5
public class ParcAttraction {
    private String nom;
    private int capacite;
    private double prix;
    private double prix_reduit;
    private int nb_billet_illimite;
    private int nb_billet_illimite5;
    private int nb_billet_reduit;
    private int nb_billet_reduit5;

    public ParcAttraction(String nom, int capacite, double prix) {
        setNom(nom);
        setCapacite(capacite);
        setPrix(prix);
        setPrix_reduit(prix-10);
    }

    public int nbPlacesDispo() {
        return capacite-(getNb_billet_illimite()+getNb_billet_illimite5()+getNb_billet_reduit()+
                getNb_billet_reduit5());
    }

    public void vendreBillets(int nb, Tarif.Tarifs tarif) {
        if(nb > (getCapacite()-getNb_billet_reduit5()-getNb_billet_reduit()-getNb_billet_illimite()-getNb_billet_illimite5())) {
            System.out.println("Le nombre de places demandé dépasse la capacite actuelle du parc");
            return;
        }
        if(tarif == Tarif.Tarifs.illimité) {
            setNb_billet_illimite(getNb_billet_illimite() + nb);
            return;
        }
        if(tarif == Tarif.Tarifs.illimité5) {
            setNb_billet_illimite5(getNb_billet_illimite5() + nb);
            return;
        }
        if(tarif == Tarif.Tarifs.réduit) {
            setNb_billet_reduit(getNb_billet_reduit()+nb);
            return;
        }
        if(tarif == Tarif.Tarifs.réduit5) {
            setNb_billet_reduit5(getNb_billet_reduit5() + nb);
            return;
        }
        else
            System.out.println("Le type de tarif choisi n'existe pas");
    }

    public void reinitialiser() {
        setNb_billet_illimite(0);
        setNb_billet_illimite5(0);
        setNb_billet_reduit(0);;
        setNb_billet_reduit5(0);
    }

    public double chiffreAffaires() {
        return (double)getNb_billet_illimite()*prix+(double)getNb_billet_illimite5()*(prix-10)+(double)getNb_billet_reduit()*((prix*70)/100)+getNb_billet_reduit5()*(getPrix_reduit()*70/100);
    }

    public double tauxRemplissage() {
        return (double)((getNb_billet_illimite()+getNb_billet_illimite5()+getNb_billet_reduit()+getNb_billet_reduit5())*100)/capacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNb_billet_illimite() {
        return nb_billet_illimite;
    }

    public void setNb_billet_illimite(int nb_billet_illimite) {
        this.nb_billet_illimite = nb_billet_illimite;
    }

    public int getNb_billet_illimite5() {
        return nb_billet_illimite5;
    }

    public void setNb_billet_illimite5(int nb_billet_illimite5) {
        this.nb_billet_illimite5 = nb_billet_illimite5;
    }

    public int getNb_billet_reduit() {
        return nb_billet_reduit;
    }

    public void setNb_billet_reduit(int nb_billet_reduit) {
        this.nb_billet_reduit = nb_billet_reduit;
    }

    public int getNb_billet_reduit5() {
        return nb_billet_reduit5;
    }

    public void setNb_billet_reduit5(int nb_billet_reduit5) {
        this.nb_billet_reduit5 = nb_billet_reduit5;
    }

    public double getPrix_reduit() {
        return prix_reduit;
    }

    public void setPrix_reduit(double prix_reduit) {
        this.prix_reduit = prix_reduit;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("\nParc ");
        sb.append(nom).append(",\n");
        sb.append("Capacité d'accueil : ").append(getCapacite()).append(",\n");
        sb.append("Tarif normal illimmité : ").append(getPrix()).append(" euros,\n");
        sb.append("Tarif normal illimmité 5: ").append(getPrix_reduit()).append(" euros,\n");
        sb.append(getNb_billet_illimite()).append(" billets vendues au tarif illimité,\n");
        sb.append(getNb_billet_illimite5()).append(" billets vendues au tarif illimité 5,\n");
        sb.append(getNb_billet_reduit()).append(" billets vendues au tarif réduit,\n");
        sb.append(getNb_billet_reduit5()).append(" billets vendues au tarif réduit 5.\n");
        sb.append("Nombre de place disponibles : ").append(nbPlacesDispo()+ "\n");
        return sb.toString();
    }
}
