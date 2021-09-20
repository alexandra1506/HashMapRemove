package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


/*
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 1000);
        map.put("Федоров", 300);
        map.put("Достоевский", 550);
        map.put("Грозный", 1100);
        map.put("Пушкин", 900);
        map.put("Мураками", 1000);
        map.put("Иванова", 7000);
        map.put("Петрова", 700);
        map.put("Сидорова", 400);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map); // копия по которой проходим,
        // а удаляем из мэпы
        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            String key = pair.getKey();                      //ключ
            Integer value = pair.getValue();                  //значение
            if(value < 500){
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
    }
}
