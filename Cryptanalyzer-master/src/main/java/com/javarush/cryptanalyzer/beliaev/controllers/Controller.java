package com.javarush.cryptanalyzer.beliaev.controllers;

import com.javarush.cryptanalyzer.beliaev.repository.ReadToFile;
import com.javarush.cryptanalyzer.beliaev.repository.WriteToFile;
import com.javarush.cryptanalyzer.beliaev.service.BruteForce;
import com.javarush.cryptanalyzer.beliaev.service.Decode;
import com.javarush.cryptanalyzer.beliaev.service.Encode;
import com.javarush.cryptanalyzer.beliaev.service.StatAnalize;

import java.io.IOException;

public class Controller {
    public static void EncodeController() throws IOException { //TODO в параметры получать кейс и от этого выбирать путь файла
        Encode encode = new Encode();
        WriteToFile.writeDefaultFile(encode.encoder(ReadToFile.readDefaultFile()));   //записываем файл по умолчанию(расшифровываем файл (читаем файл по умолчанию))
    }

    public static void DecodeController() throws IOException {
        Decode decode = new Decode();
        WriteToFile.writeDefaultFile(Decode.decoder(ReadToFile.readDefaultFile()));
    }

    public static void BruteForceController() throws IOException {
        BruteForce bruteforce = new BruteForce();
        WriteToFile.writeDefaultFile(bruteforce.bruteforce(ReadToFile.readDefaultFile()));
    }

    public static void StatAnalizeController() throws IOException {
        StatAnalize dictionary = new StatAnalize();
        StatAnalize decodeDictionary = new StatAnalize();
        dictionary.addMap(dictionary.getDictionary(),ReadToFile.readDictionary());   // добавляем из словаря
        decodeDictionary.addMap(decodeDictionary.getInputDataDictionary(),ReadToFile.readEncodeDictionary());   // добавляем из закодированного файла инфу


    }

}
