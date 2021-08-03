package com.company;
class Maths{
    public int  add(int a,int b){
        return a+b ;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(char a,char b){
        return a+b;
    }
}
public class TestOverLoading {
    public static  void main(String[] args){
        Maths m= new Maths();
        System.out.println(m.add(1,2));
        System.out.println(m.add(1,4,6));
        System.out.println(m.add('2','6'));
    }
}
