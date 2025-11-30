package org.example;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

       ShapeReader reader = new ShapeReader();

       reader.shapeReader(new UserInterface().ShapeIndexInput());

    }
}