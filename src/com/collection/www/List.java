package com.collection.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {
    public static void main(String[] args) {
        //ArrayList
        ArrayList al = new ArrayList();
        al.add("Tilak");
        al.add("sai");
        al.add("Kumar");

        //ArrayList with Genrics
        ArrayList<Integer> al1 = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            al1.add(i);
        }
        System.out.println(al);
        System.out.println(al1);

        //Converting Collection to Arrays
        Integer[] intArray = new Integer[al1.size()];
        intArray = al1.toArray(intArray);

        //Linked List
        LinkedList<String> ll = new LinkedList<>();
        ll.add("one");
        ll.add("Two");
        ll.add("Three");
        ll.add(null);
        System.out.println((ll));
        ll.add(3,"Four");
        System.out.println((ll));
        ll.addFirst("Tilak");
        ll.addLast("Sai");
        System.out.println((ll));
        ll.removeFirst();
        ll.removeLast();
        System.out.println((ll));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        //Vector
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i <=10; i++) {
            v.add(i);
        }
        System.out.println(v);
        v.removeElement(10);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);

        //Stack
        Stack<Character> s = new Stack<>();
        s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search('B'));
        System.out.println(s.search('D'));
    }
}
