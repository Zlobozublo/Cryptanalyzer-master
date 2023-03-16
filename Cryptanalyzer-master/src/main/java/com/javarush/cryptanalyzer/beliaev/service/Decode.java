package com.javarush.cryptanalyzer.beliaev.service;

import com.javarush.cryptanalyzer.beliaev.constants.Alphabet;

public class Decode {
    private static String outputData;
    private static int step = -2;

    public static String getOutputData() {
        return outputData;
    }
    public static void setStep(int step) {
        Decode.step = step;
    }
    public static String decoder(StringBuilder inputData) {

        char[] vyvod = new char[inputData.length()];
        for (int i = 0; i < inputData.length(); i++) {
            char buffer = inputData.charAt(i);                   //берем символ под индексом i
            int index = Alphabet.alphabet.indexOf(buffer);  //ищем в алфавите символ
            vyvod[i] = Alphabet.alphabet.charAt((index + step + Alphabet.alphabet.length()) % Alphabet.alphabet.length());  //позиция + шаг делим с остатком на количество символов в алфавите
        }

        outputData = new String(vyvod); //приводим к строке
        return outputData;
    }
}
