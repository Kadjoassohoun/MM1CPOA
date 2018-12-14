package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.IEnseignant;

import java.util.Date;

public class Enseignant extends Personnel implements IEnseignant {

    private double salaire;
    private Date dateRecrutement;

    public Enseignant(String nom, String prenom, Date dateRecrutement, int numeroOrdre, double salaire)
    {
        super(nom, prenom, dateRecrutement, numeroOrdre);
        this.salaire = salaire;
    }

    @Override
    public Date dateRecrutement()
    {
        return dateRecrutement;
    }

    @Override
    public double salaire()
    {
        return salaire;
    }
}
