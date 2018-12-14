package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.EchelonBourse;

import java.util.Date;

public class Doctorant extends Etudiant {

    public Doctorant(String nom, String prenom, Date dateEntree, int numeroOrdre, int echelon)
    {
        super(nom,prenom,dateEntree,numeroOrdre, EchelonBourse.DOCTORANT);
    }


}
