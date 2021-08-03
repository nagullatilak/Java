package com.exceptions.www;

public class TestException1 {
    public static void main(String[] args) {
        try {
            //Object ref = null;
            //ref.toString();
            int i=10/0;
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
