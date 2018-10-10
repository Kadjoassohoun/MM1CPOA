package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Cone extends Shape3D {

    private double height;
    private double radius;

    public Cone( double h, double r)
    {
        this.height = h;
        this.radius = r;
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


    }

    @Override
    public double surface()
    {

    }
}
