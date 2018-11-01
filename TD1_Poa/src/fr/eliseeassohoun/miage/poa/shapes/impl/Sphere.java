package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Sphere extends Shape3D {

    public static final double PI = 3.14159265358979323846;
    private double radius;

    public Sphere(double aRadius)
    {
        this.radius = aRadius;
    }

    public Sphere(Point3D refPoint) {
        super(refPoint);
    }

    public double getRadius()
    {
        return this.radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double volume()
    {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

}

