package com.testproject.koty;

import com.testproject.koty.domain.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by jtanistra on 2016-10-07.
 */

public class Interfejs {

    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.print("Give me cat name: ");
        cat.setCatName(getUserInput());

        System.out.print("Give me cat guardian name: ");
        cat.setGardian(getUserInput());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        do {
            System.out.print("Give me cat birdth date in format RRRR.MM.DD: ");
            try {
                cat.setBirthDate(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Something goes wrong. Incorrect date format");
            }
        } while (cat.getBirthDate() == null);

        do {
            System.out.print("Give me cat weight : ");
            try {
                cat.setCatWeight(Float.valueOf(getUserInput()));
            } catch (NumberFormatException nfe) {
                System.out.println("Something is wrong with weight format. Example 10.0");
            }
        } while (cat.getCatWeight() == null);

        System.out.print("Thanks, everytings it's clear now \n");

        System.out.print(cat.przedstawSie());
    }
    public static String getUserInput() { return inputScanner.nextLine().trim();}
}
