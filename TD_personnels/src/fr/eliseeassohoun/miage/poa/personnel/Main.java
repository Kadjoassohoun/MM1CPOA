package fr.eliseeassohoun.miage.poa.personnel;

import fr.eliseeassohoun.miage.poa.personnel.api.Boursier;
import fr.eliseeassohoun.miage.poa.personnel.implem.Doctorant;
import fr.eliseeassohoun.miage.poa.personnel.implem.Personnel;
import fr.eliseeassohoun.miage.poa.personnel.api.IPersonnel;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        IPersonnel bob = new Doctorant( "Assohoun ", "Elisée ", new Date(), 12);
        System.out.println(bob);
	// write your code here
    }
}
