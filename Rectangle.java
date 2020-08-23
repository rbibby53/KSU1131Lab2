//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 2

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //Get Width
        Scanner preWidth = new Scanner(System.in);
        System.out.print("Enter width: ");
        double Width = preWidth.nextDouble();
        //Get Height
        Scanner preHeight = new Scanner(System.in);
        System.out.print("Enter Height: ");
        double Height = preHeight.nextDouble();
        //Print resalts
        System.out.println("The Area is " + Width*Height);
        System.out.println("The perimeter is " + 2*(Width+Height));
    }
}
