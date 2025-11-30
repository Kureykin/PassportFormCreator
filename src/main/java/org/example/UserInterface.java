package org.example;

import java.util.Scanner;

public class UserInterface {
    public Shape ShapeIndexInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("List of Shapes: \n1 - Square \n2 - Circle \n3 - Line \n4 - Oval \n5 - Rectangel\n");
        System.out.print("Please, write your choice \n>> ");
        int result = scanner.nextInt();
        scanner.close();

        return switch (result) {
            case 1 -> new Square();
            case 2 -> new Circle();
            case 3 -> new Line();
            case 4 -> new Oval();
            case 5 -> new Rectangel();
            default -> null;
        };
    }
}
