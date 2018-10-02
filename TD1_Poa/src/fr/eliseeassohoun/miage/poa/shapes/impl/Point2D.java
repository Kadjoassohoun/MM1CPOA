package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Point2D {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(){

        this(0,0);
    }


    public void translate( double xs, double ys)
    {
        this.x += xs;
        this.y += ys;

    }



}
