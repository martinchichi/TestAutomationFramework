package FirtsAutomation;

import org.testng.annotations.*;

public class OurTests {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("Before Suite - Chrome -  Set up System Property");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test - Open Chrome");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class - Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method - Sign in");
    }

    @Test
    public void searchCustomer(){
        System.out.println("Search for customer");
    }

    @Test
    public void searchProduct(){
        System.out.println("Search for Product");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method - Sign Out");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class - Close Test Application");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test - Close Chrome");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite - Chrome - Clean Up All Cookies");
    }







}
