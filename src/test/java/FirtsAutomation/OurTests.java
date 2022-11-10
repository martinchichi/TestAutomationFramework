package FirtsAutomation;

import org.testng.Assert;
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

    @Test (priority = 1)
    public void searchCustomer(){
        System.out.println("Search for customer");
    }

    @Test (priority = 2)
    public void searchProduct(){
        System.out.println("Search for Product");
        String unObjeto="algo";
        Assert.assertEquals(unObjeto,"algo","This is a message");

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
