package com.javarush.cryptanalyzer.beliaev.service;

import com.javarush.cryptanalyzer.beliaev.constants.Alphabet;
import com.javarush.cryptanalyzer.beliaev.controllers.Controller;
import com.javarush.cryptanalyzer.beliaev.controllers.Text;
import com.javarush.cryptanalyzer.beliaev.view.ConsoleView;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BruteForce {
    private String outputData;

    private int step;

    public String bruteforce(StringBuilder inputData) {
        String str = null;
            String regex = "\\s[а-яё]+(\\.\\s|\\W\\s|\\s)([А-ЯЁ]|[а-яё])[а-яё]+(\\W\\s|\\s)";  // шаблон для регулярного выражения "\\s[а-яё]+(\\.\\s|\\W\\s|\\s)([А-ЯЁ]|[а-яё])[а-яё]+(\\W\\s|\\s)"

        /* REGEX РАСШИФРОВКА ШАБЛОНА
        \s пробел
        [а-яё] символы маленькие от а до я
        + сколько угодно
        (\.\s|\W\s|\s) точка и пробел ИЛИ не символьный знак и пробел ИЛИ пробел
        ([А-ЯЁ]|[а-яё]) Большой символ или маленький
        [а-яё] символы маленькие от а до я
        + сколько угодно
        (\W\s|\s) не символьный знак и пробел ИЛИ пробел
        */

        Pattern pattern = Pattern.compile(regex);

        //цикл по возможным вариантам
        for(int i = 0; i < Alphabet.alphabet.length(); i++){
            Decode.setStep(i);                 // меняется шаг расшифровки
            str = Decode.decoder(inputData);  // расшифровываем текст
            Matcher matcher = pattern.matcher(str);

            if (matcher.find()) {   //Если вариант подошел по шаблону спрашиваем подходит ли он
                System.out.println("Вариант №" + i + " Ищем дальше? \n введите 1 если да \n введите 2 если нет");
                System.out.println(str);
                int temp = Text.textInputInt();
                if(temp == 2){
                    break;
                }
            }
        }
        outputData = new String(str);
        return outputData;
    }
}
