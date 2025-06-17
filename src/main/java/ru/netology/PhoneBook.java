package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> numberToName = new HashMap<>();
    private Map<String, String> nameToNumber = new HashMap<>();

    public int add(String name, String number) {
        if (!nameToNumber.containsKey(name)) {
            nameToNumber.put(name, number);
            numberToName.put(number, name);
            return nameToNumber.size();
        } else {
            return nameToNumber.size();
        }
    }

    public String findByNumber(String number) {
        return numberToName.getOrDefault(number, null);
    }

}