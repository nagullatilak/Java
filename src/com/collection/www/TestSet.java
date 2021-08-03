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

      /*  //Comparator Interface
        TreeSet<Integer> tsc = new TreeSet<>(new MyComparator());
        tsc.add(10);
        tsc.add(1);
        tsc.add(8);
        tsc.add(5);
        System.out.println(ts);*/

    }
}
/*class MyComparator implements Comparator{
    public int compare(Object o1,Object o2){
        Integer i1 =(Integer) o1;
        Integer i2 =(Integer) o2;
        if(i1<i2){
            return +1;
        }
        else if(i1>i2){
            return  -1;
        }
        else{
            return 0;
        }
    }

}*/
