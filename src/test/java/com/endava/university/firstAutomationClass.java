package com.endava.university;

import org.testng.annotations.BeforeTest;

public class firstAutomationClass {

    public static void main(String[] args) {

        new firstAutomationClass().setUp();


    }
    @BeforeTest
    public void setUp(){
        System.out.println("First test annotation");
    }


}
