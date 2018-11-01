package fr.eliseeassohoun.miage.poa.shapes.impl;

public class Point3D extends Point2D {

    private double z;

    public Point3D()
    {
        this.z = 0.0;
    }

    public double getZ() {
        return z;
    }

    @Override
    public void translate(double xs, double ys, double zs)
    {
        super.translate(double xs, double ys);
        this.z = this.z + zs;
    }

    @Override
    public double distance (Point3D dist)
    {
        double dz = getZ()-dist.z;
        double dx = getX()-dist.x;
        double dy = getY()-dist.y;


        return Math.sqrt((dx * dx * dx) + (dy * dy * dy) + (dz * dz dz);)

    }

}

