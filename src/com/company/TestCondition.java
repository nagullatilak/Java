package com.company;

import java.util.Scanner;

public class TestCondition {
    public static void main(String[] args) {
        //Conditions
        System.out.println("Conditions");
        //if condition
        boolean status = true;
        if(status){
            System.out.println("Status is active");
        }
        else {
            System.out.println("Status is Inactive");
        }

       // else if
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 4:");
        int num = sc.nextInt();
        if(num==1)
            System.out.println("Entered number is :"+num);
        else if(num==2)
            System.out.println("Entered number is :"+num);
        else if(num==3)
            System.out.println("Entered number is :"+num);
        else if(num==4)
            System.out.println("Entered number is :"+num);
        else
            System.out.println("Entered number is :"+num);

        //Switch Statement
        System.out.println("Enter the number between 1 to 4:");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Entered Number" +number);
                break;
            case 2:
                System.out.println("Entered Number" +number);
                break;
            case 3:
                System.out.println("Entered Number" +number);
                break;
            case 4:
                System.out.println("Entered Number" +number);
                break;
            default:
                System.out.println("Entered number:"+number);

        }

    }
}
