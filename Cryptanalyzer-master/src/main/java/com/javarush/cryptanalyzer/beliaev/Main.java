package com.javarush.cryptanalyzer.beliaev;

import com.javarush.cryptanalyzer.beliaev.constants.Alphabet;
import com.javarush.cryptanalyzer.beliaev.repository.ReadToFile;
import com.javarush.cryptanalyzer.beliaev.view.ConsoleView;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Deque;
import java.util.Scanner;

import static com.javarush.cryptanalyzer.beliaev.repository.ReadToFile.inputData;

public class Main {
    public static void main(String[] args) throws IOException {

        ConsoleView console = new ConsoleView();
        console.Menu();

      }
}

