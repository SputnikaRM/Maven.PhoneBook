package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String, List<String>> map;
   List <String> list = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {this.map=map;

    }

    public PhoneBook() { map= new LinkedHashMap<>();
        // this(null);
    }

    public void add(String name, String phoneNumber) {
        if(map.containsKey(name))
            map.get(name).add(phoneNumber);
        else{map.put(name,list);
            add(name,phoneNumber);}

    }

    public void addAll(String name, String... phoneNumbers) {

        map.put(name, Arrays.asList(phoneNumbers));


    }

    public void remove(String name) {

        map.remove(name);
    }

    public Boolean hasEntry(String name) {

        if( map.containsKey(name))
            return true;
        return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String s="";
        for(Map.Entry<String,List<String>> entry : map.entrySet())
//            if(entry.getValue().equals(phoneNumber))
            s= entry.getKey();
        return s;

    }

    public List<String> getAllContactNames() {
        ArrayList<String> names = new ArrayList<>();
        for(String s : map.keySet())
            names.add(s);
        return names;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
