package fr.eliseeassohoun.miage.poa.shapes.api;

import fr.eliseeassohoun.miage.poa.shapes.impl.Point2D;

public interface Translatable2D {

    Point2D getRefPoint();

    void translate( double dx, double dy);

}
