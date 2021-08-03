package com.company;
//Multiple Level Inheritance
class Animal{
    public void eat(){
        System.out.println("Eating ..");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Barking..");
    }
}
class Cat extends  Animal{
    public void meow(){
        System.out.println("Meowing ..");
    }
}
public class TestInheritance3 {
    public static  void main(String[] args){
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
