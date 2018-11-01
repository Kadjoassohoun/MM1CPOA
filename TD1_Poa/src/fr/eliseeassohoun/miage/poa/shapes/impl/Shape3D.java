package fr.eliseeassohoun.miage.poa.shapes.impl;

import fr.eliseeassohoun.miage.poa.shapes.api.Translatable3D;

public abstract class Shape3D extends Shape implements Translatable3D {

    private Point3D refPoint;


    public abstract double volume();


    public Shape3D( Point3D refPoint)
    {
        this.refPoint = refPoint;

    }

    public Point3D getRefPoint()
    {
        return this.refPoint;
    }

}
