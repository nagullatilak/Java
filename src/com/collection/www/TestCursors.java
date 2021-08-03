package com.collection.www;

import java.util.*;

public class TestCursors {
    public static void main(String[] args) {
        //Enumeration
        Vector v = new Vector();
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if (i % 2 == 0)
                System.out.println(i);//0 2 4 6 8 10
        }
        System.out.print(v);


        //Iterator
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=10;i++){
            al.add(i);
        }
        System.out.println(al);
        Iterator it = al.iterator();
        while(it.hasNext()){
            Integer i = (Integer) it.next();
            if(i%2==0){
                System.out.println(i);
            }
            else {
                it.remove();
            }
        }
        System.out.println(al);

        //List Iterator
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Tilak");
        aList.add("Tharun");
        aList.add("Ananth");
        aList.add("Vdenki");
        aList.add("Subbu");
         System.out.println(aList);
        ListIterator<String> li = aList.listIterator();
        while (li.hasNext()) {
            String name=(String) li.next();
            if(name.equals("Tilak")){
                li.set("Tilak sai kumar");
            }
        }
        System.out.println("The ArrayList elements in the reverse direction are: ");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }

}

