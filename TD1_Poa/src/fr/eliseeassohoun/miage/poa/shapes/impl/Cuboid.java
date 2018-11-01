package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Cuboid extends Shape3D {

    private double length;
    private double height;
    private double width;

    public Cuboid()
    {
        this(0,0,0);
    }


    public Cuboid( double l, double h, double w){

        this.height = h;
        this.length = l;
        this.width = w;
    }

    public double getLength()
    {
        return length;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public void setLength( double lenght)
    {
        this.length = length;
    }

    public void setHeight( double height)
    {
        this.height = height;
    }

    public void setWidth( double width)
    {
        this.width = width;
    }

    public double volume()
    {
        return (height * width * length);
    }

    public double surface()
    {
        return ( 2 * height + 2 * length + 2 * width );
    }


}
