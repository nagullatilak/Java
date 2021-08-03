package com.exceptions.www;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
public class CustomException {
    public  static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age  :");
        int age = sc.nextInt();
        if(age < 18){
            throw  new TooYoungException("You are not elgible for vote");
        }
        else{
            throw  new TooOldException("You are eligible fpr vote");
        }
    }
}
