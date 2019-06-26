package com.zipcodewilmington.phonebook;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String, List<String>> map;
    ArrayList <String> phoneNumbers = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {this.map=map;
    }

    public PhoneBook() { map= new LinkedHashMap<>();
        // this(null);
    }

    public void add(String name, String phoneNumber) {
    }

    public void addAll(String name, String... phoneNumbers) {
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return null;
    }

    public List<String> lookup(String name) {
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
