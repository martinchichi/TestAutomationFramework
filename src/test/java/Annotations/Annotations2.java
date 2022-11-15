package Annotations;

import org.testng.annotations.BeforeTest;

public class Annotations2 {

    public static void main(String[] args) {
        new Annotations2().setUp();
    }

    @BeforeTest
    public void setUp(){
        System.out.println("First test annotation");
    }

}
