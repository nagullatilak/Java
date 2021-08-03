package com.company;
//Multi Level Inheritance
class Faculty2
{
    float total_sal=0, salary=30000;
    public void faculty(){
        System.out.println("THis is  Faculty class");
    }
}

class HRA extends Faculty2
{
    float hra=3000;
    public void hra(){
        super.faculty();
        System.out.println("THis is  HRA class");

    }
}

class DA extends HRA
{
    float da=2000;
    public void da(){
        super.hra();
        System.out.println("THis is DA class");
    }
}

class MathsFaculty extends DA
{
     float da1=super.da;
    float bonous=2000;
    public  void mathsTeacher(){
        super.da();
            System.out.println("THis is Maths Faculty class");
    }
}
public class TestInheritance2 {
    public static void main(String args[])
    {
       MathsFaculty obj=new MathsFaculty();
        obj.total_sal=obj.salary+obj.hra+obj.da1+obj.bonous;
        System.out.println("Total Salary is:"+obj.total_sal);
        obj.mathsTeacher();
    }
}
