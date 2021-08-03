package com.company;
class Father{
    public void home(){
        System.out.println("Fathers Home");
    }
    public  void car(){
        System.out.println(("Fathers  Car"));
    }
}
class Son extends Father{
    @Override
    public  void car(){
        System.out.println(("Sons  Car"));
    }
}
public class TestOverRidding {
    public  static  void main(String[] args){
        Son s = new Son();
        s.car();
        s.home();
        Father f = new Father();
        f.car();
        f.home();

    }
}
