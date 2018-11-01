package fr.eliseeassohoun.miage.poa.shapes.impl;

import java.lang.Math;

public class Cone extends Shape3D {

    public static final double PI = 3.14159265358979323846;
    private double height;
    private double radius;

    public Cone()
    {
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(Point3D refPoint) {
        super(refPoint);
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight( double height)
    {
        this.height = height;
    }

    public void setRadius( double radius){

        this.radius = radius;
    }

    @Override
    public double volume() {

        return  (PI * radius * radius * height)/3;
    }

    @Override
    public double surface()
    {
        double s = Math.sqrt((radius * radius) + (height * height));
        return ((PI * radius * s) + (PI * radius * radius));
    }
}
