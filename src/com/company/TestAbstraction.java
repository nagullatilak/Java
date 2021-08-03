package com.company;
abstract class Bank{
        abstract int getRateOfInterest();
            public void deposit(){
            System.out.println("This is used to know Rate of Interest");
        }
        }
 class SBI extends Bank{
    public int getRateOfInterest(){
        return 7;
    }
 }
class HDFC extends Bank{
    public int getRateOfInterest(){
        return 5;
    }
}
public class TestAbstraction {
    public static  void main(String[] args){
        Bank b;
        b= new SBI();
        System.out.println("Rate of Interest  :"+b.getRateOfInterest()+"%");
        b.deposit();
        b= new HDFC();
        System.out.println("Rate of Interest  :"+b.getRateOfInterest()+"%");
        b.deposit();

    }
}
