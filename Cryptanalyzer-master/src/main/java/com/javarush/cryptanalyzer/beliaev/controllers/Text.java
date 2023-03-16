package com.javarush.cryptanalyzer.beliaev.controllers;

import java.util.Scanner;

public class Text {
    public static String textInputString() {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        console.close();
        return text;
    }

    public static int textInputInt() {
        Scanner console = new Scanner(System.in);
        int text = console.nextInt();
        console.nextLine();

        return text;
    }
}
