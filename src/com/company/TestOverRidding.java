package com.company;
class FatherAssets{
    public void home(){
        System.out.println("Fathers Home");
    }
    public  void car(){
        System.out.println(("Fathers  Car"));
    }
}
class SonAssets extends FatherAssets{
    @Override
    public  void car(){
        System.out.println(("Sons  Car"));
    }
}
public class TestOverRidding {
    public  static  void main(String[] args){
        SonAssets s = new SonAssets();
        s.car();
        s.home();
        FatherAssets f = new FatherAssets();
        f.car();
        f.home();

    }
}
