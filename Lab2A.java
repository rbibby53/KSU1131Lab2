//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 2

import java.util.Scanner;


public class Lab2A {
    public static void main(String[] args) {
        //Asks user for first name and stores it as name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.next();
        //Asks user for first name and stores it as secName
        Scanner secinput = new Scanner(System.in);
        System.out.print("Enter another name: ");
        String secName = secinput.next();
        //Asks user for a verb and stores it as verb
        Scanner preverb = new Scanner(System.in);
        System.out.print("Enter a Verb: ");
        String verb = preverb.next();
        //Asks user for a adverb and stores it as verb
        Scanner preadverb = new Scanner(System.in);
        System.out.print("Enter a Adverb: ");
        String adverb = preadverb.next();
        //Outputs the responce
        System.out.println("Once upon a time, there was a person named "+ name + " who had a child named\n" + secName + ". This child would " + verb +" " + adverb + " while singing to strangers.");
    }

}
