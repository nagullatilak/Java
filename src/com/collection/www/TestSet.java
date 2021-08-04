package com.collection.www;

import java.util.*;

public class TestSet {
    public  static  void main(String[] args){
        //HashSet
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One");
        set.add(null);
        System.out.println((set));
        System.out.println(set.hashCode());

        //Linked Hashset
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add(null);
        System.out.println(hs);

        //Tree Set
        TreeSet ts = new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        //ts.add("Tilak"); class cast expection
        System.out.println(ts);
        //ts.add(null); Null pointer EXception
        System.out.println(ts);

        //Comparable Interface
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("A"));
        System.out.println("B".compareTo("B"));



    }
}

