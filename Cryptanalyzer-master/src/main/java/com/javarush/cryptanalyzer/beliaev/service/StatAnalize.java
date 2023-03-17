package com.javarush.cryptanalyzer.beliaev.service;

import java.util.HashMap;
import java.util.Map;

public class StatAnalize {

   private HashMap<Character, Integer> dictionary = new HashMap<>();    // для хранения словаря
   private HashMap<Character, Integer> inputDataDictionary = new HashMap<>(); //хранение зашифрованного текста

    public HashMap<Character, Integer> getDictionary() {
        return dictionary;
    }
    public HashMap<Character, Integer> getInputDataDictionary() {
        return inputDataDictionary;
    }

    public void addMap(HashMap<Character, Integer> map, StringBuilder inputData){    //добавляем с помощью цикла значние и ключ в мапу
        Character key;

        for (int i = 0; i < inputData.length(); i++) {
            key = inputData.charAt(i);
            if(map.containsKey(inputData.charAt(i))){  // если ключ есть
                map.put(key, map.get(key) + 1); // берем значние по ключу +1
            } else {                            // если нет
                map.put(key, 1);                // добавляем ключ и значение 1
            }
        }
        System.out.println(map);
    }

//    public void collectionComparision(HashMap<Character, Integer> dictionary, HashMap<Character, Integer> encodeDictionary){
//        //сравниваем ключи коллекции для поиска совпадения значения
//        for (Map.Entry entry: dictionary.entrySet()) {
//            dictionary.put();
//        }




}
