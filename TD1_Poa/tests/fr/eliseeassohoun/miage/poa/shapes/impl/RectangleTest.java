package fr.eliseeassohoun.miage.poa.shapes.impl;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTest {

    Rectangle r1;

    @BeforeMethod
    public void setUp() throws Exception{

        Point2D p = new Point2D(1,3);

        r1 = new Rectangle(p, 4, 3);

    }



    @AfterMethod
    public void tearDown() {

        r1 = null;
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSurface() {
    }

    @Test
    public void testGetRefPoint() {
    }

    @Test
    public void testPerimeter1() {
    }
}