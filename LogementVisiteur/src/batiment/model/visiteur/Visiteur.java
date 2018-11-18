package batiment.model.visiteur;

import batiment.model.base.*;

public interface Visiteur {
    Object value();
    void visit(Truc t);
    void visit(CollectionDeLivres c);
    void visit(GardeRobe g);
    void visit(Bureau b);
    void visit(Lamp l);
    void visit(Lit l);
    void visit(Piece p);
    void visit(Univers u);
    void visit(Vetement v);
}
