package com.javarush.cryptanalyzer.beliaev.view;

import com.javarush.cryptanalyzer.beliaev.controllers.Controller;
import com.javarush.cryptanalyzer.beliaev.controllers.Text;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView {
    public void Menu() throws IOException {
        System.out.println("Выберите режим работы: " +
                "\n 1 - Шифратор " +
                "\n 2 - Дешифратор " +
                "\n 3 - BruteForce " +
                "\n 4 - Статистический анализ");

        switch(Text.textInputInt()) {
            case (1): ConsoleView.MenuEncode();
                break;
            case (2): ConsoleView.MenuDecode();
                break;
            case (3): ConsoleView.BruteForce();
                break;
            case (4): ConsoleView.StatAnalize();
                break;
        }
    }
    public  static void MenuEncode() throws IOException {
        System.out.println("Введите путь файла или нажмите ENTER для работы по умолчанию");
    //TODO починить ввод
        switch(1) {
            case (1):
                System.out.println("Выбран режим работы по умолчанию");
                Controller.EncodeController();
                break;
            case (2):
                break;
        }

    }
    public static void MenuDecode() throws IOException {
        System.out.println("Введите путь файла или нажмите ENTER для работы по умолчанию");
        int console = 1;
        switch(console){
            case (1):
                System.out.println("Выбран режим работы по умолчанию");
                Controller.DecodeController();
                break;

            case (2):
                break;
        }
    }
    public static void BruteForce() throws IOException {
        System.out.println("Выберите режим работы: ");
            switch(1){
            case (1):
                System.out.println("Выбран режим работы по умолчанию");
                Controller.BruteForceController();
                break;
            case (2):
                break;
        }
    }
    public static void StatAnalize() throws IOException {
        System.out.println("Выберите режим работы: ");
        switch(1){
            case (1):
                System.out.println("Выбран режим работы по умолчанию");
                Controller.StatAnalizeController();
                break;
            case (2):
                break;
        }
    }

}
