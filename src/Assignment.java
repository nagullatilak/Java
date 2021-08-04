class Test{
    public static void multiples(){
        //Taking the input values form For loop
        for(int i=1;i<=100;i++){
            //Checking the number is divisible by 3 and 5 or not
            if(i%3 ==0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            //Checking the number is Divisible by 3 or not
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            //Checking the number is Divisible by 5 or not
            else if(i%5 ==0){
                System.out.println("Buzz");
            }
            //If the number is not divisible by 3 or 5 ,it will print that number
            else{
                System.out.println(i);
            }
        }
    }
}
public class Assignment {
    public static  void main(String[] args){
        //Calling the method
       Test.multiples();
    }
}
