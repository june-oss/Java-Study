package com.june.java;

public class Foo {

    public static void main(String[] args) {
        //익명 내부 클래스
        RunSomthing runSomthing = new RunSomthing() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        RunSomthing run = () -> System.out.println("Hello");

    }


}
