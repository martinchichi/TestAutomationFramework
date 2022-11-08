package org.example;

import org.testng.annotations.BeforeTest;

public class Main {

    @BeforeTest
    public void setUp(){
        System.out.println("First test annotation");
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}