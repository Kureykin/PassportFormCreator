package org.example;

import java.util.Scanner;

class ShapeReader
{

    public void shapeReader(Shape shape)
    {
        if(shape == null)
            System.out.println("Unknow shape ID");
        else
            System.out.println(shape.getName());
    }
}