//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 2

import java.util.Scanner;
import static java.lang.System.*;

public class Lab2C {
    public static void main(String[] args){
        //Get Width
        Scanner input = new Scanner(in);
        out.print("Enter a width: ");
        int Width = input.nextInt();
        //Get Height

        out.print("Enter a Height: ");
        int Height = input.nextInt();
        //Print resalts
        out.println("The Area is " + Width*Height);
        out.println("The perimeter is " + 2*(Width+Height));
    }
}
