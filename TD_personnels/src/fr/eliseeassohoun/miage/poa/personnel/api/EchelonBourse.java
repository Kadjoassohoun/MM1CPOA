package fr.eliseeassohoun.miage.poa.personnel.api;

import fr.eliseeassohoun.miage.poa.personnel.api.Boursier;

public enum EchelonBourse {

    ZERO, UN, DEUX, TROIS, DOCTORANT;

    public double montantBourse(){

        switch( this){

            case ZERO: return 100.0;
            case UN: return 200.0;
            case DEUX: return 300.0;
            case TROIS: return 400.0;
            case DOCTORANT: return 1500.0;

            default: return 0;
        }
    }

}
