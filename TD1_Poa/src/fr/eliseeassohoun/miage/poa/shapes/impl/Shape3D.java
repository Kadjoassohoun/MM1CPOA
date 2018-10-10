package fr.eliseeassohoun.miage.poa.shapes.impl;


public abstract class Shape3D extends Shape {

    private Point3D refPoint;


    public Shape3D( Point3D refPoint)
    {
        this.refPoint = refPoint;

    }

    public Point3D getRefPoint()
    {
        return this.refPoint;
    }

    public double volume()
    {

    }




}
