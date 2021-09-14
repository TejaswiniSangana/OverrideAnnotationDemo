package com.demo;

public class Main {
    public static void main(String[] args){
        Parent object = new Parent();
        object.checkingWithoutAnnotation();
        object.checkingWithAnnotation();
        Parent object1=new Child();
        object1.checkingWithoutAnnotation();//Here we have a spelling mistake in the function name of child class. So, it is considered as a different function
        object1.checkingWithAnnotation();// Here, as we are using @Override method, there is no chance for spelling mistakes.
        Child object2=new Child();
        object2.checkingWithoutAnnotation();
    }
}
