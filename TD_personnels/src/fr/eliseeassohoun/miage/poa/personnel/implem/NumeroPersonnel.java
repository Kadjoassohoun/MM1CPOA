package fr.eliseeassohoun.miage.poa.personnel.implem;

import fr.eliseeassohoun.miage.poa.personnel.api.INumero;

import java.util.Date;

class NumeroPersonnel implements INumero {

    private Date dateEntree;
    private int numeroOrdre;

    public NumeroPersonnel( Date dateEntree, int numeroOrdre)
    {
        this.dateEntree = dateEntree;
        this.numeroOrdre = numeroOrdre;
    }

    public String numero()
    {
        return this.toString();
    }

    @Override
    public String toString(){

    }
}
