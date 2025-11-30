package org.example;

import java.util.Scanner;

public class UserInterface {
    public void ShapeIndexInput()
    {
        var reader = new ShapeReader();
        Scanner scanner = new Scanner(System.in);

        System.out.println("List of Shapes: \n1 - Square \n2 - Circle \n3 - Line \n4 - Oval \n5 - Rectangel\n");
        System.out.print("Please, write your choice \n>> ");
        int result = scanner.nextInt();
        scanner.close();

        switch (result)
        {
            case 1:
                reader.shapeReader(new Square());
                break;
            case 2:
                reader.shapeReader(new Circle());
                break;
            case 3:
                reader.shapeReader(new Line());
                break;
            case 4:
                reader.shapeReader(new Oval());
                break;
            case 5:
                reader.shapeReader(new Rectangel());
                break;
            default:
                System.out.println("Unknow shape ID");
                break;
        }
    }
}
