package com.company;
//Single Level
class Faculty{
    public void salary(){
        System.out.println("Salary : 25000");
    }
}
class ScienceFaculty extends  Faculty{
    public void bonus(){
        System.out.println("Bonus : 3000");
    }
}
public class TestInheritance1 {
    public static  void main(String[] args){
        ScienceFaculty sc = new ScienceFaculty();
        sc.salary();
        sc.bonus();
    }
}
