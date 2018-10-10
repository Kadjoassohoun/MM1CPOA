package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere( double ra)
    {
        this.radius = ra;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius( double radius)
    {
        this.radius = radius;
    }

}

