package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.IPersonnel;

import java.util.Date;

public abstract class Personnel implements IPersonnel {

    private String nom;

    private String prenom;

    private NumeroPersonnel numero;

    public Personnel( String nom, String prenom, Date dateEntree, int numeroOrdre)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = new NumeroPersonnel(dateEntree, numeroOrdre);

    }

    public String nom() {

        return nom;
    }

    public String numero() {

        return numero.numero();
    }

    public String prenom() {

        return prenom;
    }

    @Override
    public String toString(){

    }
}
