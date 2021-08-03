package com.company;
class A{
    A(){
        System.out.println("This is constructor");
    }
    public  static  String test1(){
    return "This is Test1 Method";
    }
    public void test2(){
     System.out.println("This is test2 method");
    }
}

public class TestObject {
    public static  void  main(String[] args){
      System.out.println(A.test1());
      A a = new A();
      a.test2();
    }
}
