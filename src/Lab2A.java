//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 2

import java.util.Scanner;
import static java.lang.System.*;


public class Lab2A {
    public static void main(String[] args){
        //Asks user for first name and stores it as name
        Scanner input = new Scanner(in);
        out.print("Enter a name: ");
        String name = input.next();
        //Asks user for first name and stores it as secName

        out.print("Enter another name: ");
        String secName = input.next();
        //Asks user for a verb and stores it as verb

        out.print("Enter a verb: ");
        String verb = input.next();
        //Asks user for a adverb and stores it as verb

        out.print("Enter an adverb: ");
        String adverb = input.next();
        //Outputs the responce
        out.println("Once upon a time, there was a person named " + name + " who had a child named " + secName + ". This child would " + verb +" " + adverb + " while singing to strangers.");
    }

}
