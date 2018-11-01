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

        x = 0.0;
        y = 0.0;
    }


    public void translate( double xs, double ys)
    {
        this.x = this.x + xs;
        this.y = this.y + ys;

    }

    public double distance(Point2D d)
    {
        double dx = getX()-d.x;
        double dy = getY()-d.y;

        return Math.sqrt((dx * dx) + (dy * dy));

    }


}

