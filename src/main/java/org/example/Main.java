package org.example;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


abstract class Shape
{
    abstract public String getName();
}

class Square extends Shape
{

    public String getName()
    {
        return "Square";
    }
}

class Circle extends Shape
{
    public String getName()
    {
        return "Circle";
    }
}

class Rectangel extends Shape
{
    public String getName()
    {
        return "Rectangel";
    }
}
class Line extends Shape
{
    public String getName() {
        return "Line";
    }
}
class Oval extends Shape
{
    public String getName()
    {
        return "Oval";
    }
}

class ShapeReader
{
    public void shapeReader(Shape shape)
    {
        System.out.println(shape.getName());
    }
}