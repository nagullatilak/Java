package com.collection.www;

import java.util.*;
class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("First Name", "Tilak sai");
        hm.put("Middle name", "Kumar");
        hm.put("Surname", "Nagulla");
        hm.put(null, "ABC");
        hm.put(null, "ABC");
        System.out.println(hm);
        hm.put("Surname", "Nagulla");//It wont take
        System.out.println(hm);
        System.out.println(hm.get("First Name"));
        if (!hm.isEmpty())
            System.out.println("Size of hash map " + hm.size());
        System.out.println(hm.containsKey("First Name"));
        System.out.println(hm.containsKey("abc"));
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            String value = hm.get(key);
            if (value == "Tilak sai") {
                hm.replace(key, "ABC");
            }

        }
        Collection<String> col = hm.values();
        for (String values : col) {
            if (values == "Nagulla") {
                System.out.println("Hello");
            }
        }
        System.out.println(hm.toString());

        //Linked Hash map

        Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();

        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

        //Tree Map
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(100,"Venki");
        tm.put(102,"Babu");
        tm.put(101,"Akhil");
        tm.put(103,"Sri Hari");
        tm.put(104,null);
        tm.put(109,null);
        //tm.put(null,null); Null pointer Exception
        for(Map.Entry m:tm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //Hash Table
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(1, "Tilak");
        ht.put(2, "Tharun");
        ht.put(3, "Vijay");
        ht.put(4, "Maruthi");
        //ht.put(null,null); Null Pointer Exception

        for (Map.Entry m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}