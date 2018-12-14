package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.IEnseignantPermanent;

import java.util.Date;

public class EnseignantPermanent extends Enseignant implements IEnseignantPermanent {

    private String DomaineRecherche;

    public EnseignantPermanent(String nom, String prenom, Date dateRecrutement, int numeroOrdre, double salaire, String DomaineRecherche)
    {
        super(nom, prenom, dateRecrutement, numeroOrdre, salaire);
        this.DomaineRecherche = DomaineRecherche;
    }

    @Override
    public String DomaineRecherche() {

        return DomaineRecherche;
    }
}
