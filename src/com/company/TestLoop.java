package com.company;

import java.util.Scanner;
public  class TestLoop{
    public static  void main(String[] args){
        //For Loop
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter arr["+i+"] :");
            arr[i] = sc.nextInt();
        }
        //Printing the numbers
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                int temp;
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        //for each loop
        for (int a: arr) {
            System.out.println(a);

        }

        //While loop
        System.out.println("Enter the number :");
        int rem=0,count=0;
        int num = sc.nextInt();
        int armstrong = num;
        while(num!=0){
            rem = num%10;
            count = count +rem*rem*rem;
            num=num/10;
        }
        if(count==armstrong){
            System.out.println("Given number is armstrong number");
        }
        else{
            System.out.println("Given number is not a armstrong number");
        }

        //do while loop
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while (i<1);

    }
}