package org.example;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


interface Shape
{
    public String getName();
}

class Square implements Shape
{

    public String getName()
    {
        return "Square";
    }
}

class Circle implements Shape
{
    public String getName()
    {
        return "Circle";
    }
}

class Rectangel implements Shape
{
    public String getName()
    {
        return "Rectangel";
    }
}
class Line implements Shape
{
    public String getName() {
        return "Line";
    }
}
class Oval implements Shape
{
    public String getName()
    {
        return "Oval";
    }
}

class ShapeReader
{
    public void read(Shape shape)
    {
        System.out.println(shape.getName());
    }
}

class ShapeReaderTest
{
    public static void main(String[] args)
    {
        var test = new ShapeReader();

        test.read(new Circle());

        test.read(new Oval());

        test.read(new Line());

        test.read(new Square());

        test.read(new Rectangel());

    }
}