package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.Boursier;
import fr.eliseeassohoun.miage.poa.personnel.api.EchelonBourse;

import java.util.Date;

public class Etudiant  extends Personnel implements Boursier{

    private EchelonBourse echelon;

    public Etudiant(String nom, String prenom, Date dateEntree, int numeroOrdre, EchelonBourse echelon)
    {
        super(nom,prenom,dateEntree,numeroOrdre);
        this.echelon = echelon;
    }

    @Override
    public double montantBourse()
    {
        return echelon.montantBourse();
    }

    @Override
    public String toString()
    {
        return String.format(" Etudiant %s \nbourse: 2f");
    }
}
