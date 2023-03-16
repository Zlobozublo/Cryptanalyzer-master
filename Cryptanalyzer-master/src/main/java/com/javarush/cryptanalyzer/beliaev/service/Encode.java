package com.javarush.cryptanalyzer.beliaev.service;

import com.javarush.cryptanalyzer.beliaev.constants.Alphabet;

import static com.javarush.cryptanalyzer.beliaev.repository.ReadToFile.inputData;

public class Encode {
    private String outputData;

    private int step;

    public String encoder(StringBuilder inputData) {

        char[] vyvod = new char[inputData.length()];
        this.step = 2;
        for (int i = 0; i < inputData.length(); i++) {
            char buffer = inputData.charAt(i);                   //берем символ под индексом i
            int index = Alphabet.alphabet.indexOf(buffer);  //ищем в алфавите символ
            vyvod[i] = Alphabet.alphabet.charAt((index + step) % Alphabet.alphabet.length()); //позиция + шаг делим с остатком на количество символов в алфавите
        }

        this.outputData = new String(vyvod); //приводим к строке
        return this.outputData;
    }
}
