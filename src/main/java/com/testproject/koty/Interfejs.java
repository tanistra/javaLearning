package com.testproject.koty;

import com.testproject.koty.domain.Cat;
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

        System.out.print("Thanks, everytings it's clear now \n");

        System.out.print(cat.przedstawSie());
    }
    public static String getUserInput() { return inputScanner.nextLine().trim();}
}
