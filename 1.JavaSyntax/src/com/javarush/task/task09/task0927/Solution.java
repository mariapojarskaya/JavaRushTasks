package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Васька", new Cat("Васька"));
        map.put("Петя", new Cat("Петя"));
        map.put("Петро", new Cat("Петя"));
        map.put("Вася", new Cat("Вася"));
        map.put("Люся", new Cat("Люся"));
        map.put("Ира", new Cat("Ира"));
        map.put("Жанна", new Cat("Жанна"));
        map.put("Педро", new Cat("Педро"));
        map.put("Женя", new Cat("Женя"));
        map.put("Катя", new Cat("Катя"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<Cat>(); //создание хэш сета
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator(); // объявление итератора
        while (iterator.hasNext()) { //для
            Map.Entry<String, Cat> pair = iterator.next(); //перебор значений
            cats.add(pair.getValue()); //добавление в сет
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {

            return "Cat " + this.name;
        }
    }


}
