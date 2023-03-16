package com.javarush.cryptanalyzer.beliaev.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadToFile {
    private static String inputFile = "input.txt";
    private static String dictionary = "dictionary.txt";
    private static String encodeDictionary = "encodeDictionary.txt";
    public static StringBuilder inputData;  //содержание файла

    public static StringBuilder readDefaultFile(){
        inputData = new StringBuilder();

        try (FileReader reader = new FileReader(inputFile);
             BufferedReader br = new BufferedReader(reader)) {

            // читаем построчно
            String line;
            while ((line = br.readLine()) != null) {
                inputData.append(line);
                //TODO inputData.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }

    public static StringBuilder readDictionary(){
        inputData = new StringBuilder();

        try (FileReader reader = new FileReader(dictionary);
             BufferedReader br = new BufferedReader(reader)) {

            // читаем построчно
            String line;
            while ((line = br.readLine()) != null) {
                inputData.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }

    public static StringBuilder readEncodeDictionary(){
        inputData = new StringBuilder();

        try (FileReader reader = new FileReader(encodeDictionary);
             BufferedReader br = new BufferedReader(reader)) {

            // читаем построчно
            String line;
            while ((line = br.readLine()) != null) {
                inputData.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputData;
    }

    public static void readTxtFile(){
        // TODO читаем путь с консоли

    }
}
