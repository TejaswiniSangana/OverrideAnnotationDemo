package com.demo;

public class Child extends Parent {
    public void checkingWithoutAnnotatio(){
        System.out.println("In com.demo.Child class : executing without @Override Annotation");
    }

    @Override
    public void checkingWithAnnotation(){
        System.out.println("In com.demo.Child class : executing with @Override Annotation");
    }
}
