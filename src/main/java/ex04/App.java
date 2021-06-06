/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String verb = in2.nextLine();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String adjective = in3.nextLine();

        Scanner in4 = new Scanner(System.in);
        System.out.print("Enter an adverb: ");
        String adverb = in4.nextLine();

        String outputString = "Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!";
        System.out.println(outputString);
    }
}