package com.javarush.cryptanalyzer.beliaev.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile {
    public static void writeDefaultFile(String output) throws IOException {

        Path outPath = Path.of("output.txt");
        if(Files.notExists(outPath)) {
            Files.createFile(outPath); //создаем файл
        }
        Files.writeString(outPath, output); //vyvod2
        System.out.println("Файл записан");
//        --------
//        String path = "output.txt";
//        File outPutFile = new File(path);
//
//        try{
//            boolean file = outPutFile.createNewFile();
//            System.out.println("File created!");
//        } catch (Exception E){
//            System.out.println("ПОТРАЧЕНО");
//        }
    }
}
