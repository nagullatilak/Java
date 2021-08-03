package com.exceptions.www;

public class TestException1 {
    public static void main(String[] args) {
        try {
            //Object ref = null;
            //ref.toString();
            //int n=10/0;
            int ar[] = {1, 2, 3, 4, 5};
            for (int i=0; i<=ar.length; i++)
                System.out.println(ar[i]);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        finally {
            {
                System.out.println("Inside the finally block statements will execute irrespective of Exception");
            }
        }
    }
}
