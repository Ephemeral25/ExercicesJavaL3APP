package fr.comptebancaire;

import fr.comptebancaire.exceptions.ClosedAccountException;
import fr.comptebancaire.exceptions.MinimumWithdrawException;
import fr.comptebancaire.exceptions.NoExceedingException;
import fr.comptebancaire.modeles.CompteAvecLimite;

public class CompteEpargne extends CompteAvecLimite {
    private final long versementInitial;
    private final long minimumOperation;
    private long capital;
    private double tauxInteret;

    public CompteEpargne(long plafond, long versement, long operation) {
        super(plafond);
        this.versementInitial = versement;
        this.minimumOperation = operation;
    }

    //@param: Nombre de mois dans l'année sur lequel le calcul se fait le calcul
    //(max:12)
    public double calculInteret(int nbMois) {
        return (capital*(nbMois/12)*(tauxInteret))/100;
    }

    public int retrait(int demande) throws MinimumWithdrawException, NoExceedingException, ClosedAccountException {
        if(!this.ouvert)
            throw new ClosedAccountException("Opération impossible le compte à été bloqué");
        if(demande < minimumOperation)
            throw new MinimumWithdrawException("L'opération n'a pu être effectué, le montant minimum de retrait est de : " + minimumOperation);
        if(capital-demande < 0) {
            this.ouvert = false;
            throw new NoExceedingException("Aucun découvert n'est autorisé, l'opération n'a pu être effectuée");
        }
        capital -= demande;
        return demande;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CompteEpargne{");
        sb.append("plafond(fixe)=").append(getPlafond() + ", ");
        sb.append("minimumOperation=").append(minimumOperation + ", ");
        sb.append("versementInitial=").append(versementInitial);
        sb.append('}');
        return sb.toString();
    }
}
