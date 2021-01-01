package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeTest
    public void beforeTest() {
        System.out.println("execute before test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("execute after test");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @Test(priority = 1)
    public void firstTest() {
        System.out.println("execute first test case");
    }

    @Test(priority = 2, dependsOnMethods = {"firstTest"}, alwaysRun=true)
    public void secondTest() {
        System.out.println("execute second test case");
    }
    
    @Test(priority = 3, dependsOnMethods = {"firstTest"}, alwaysRun=true)
    public void thirdTest() {
        System.out.println("execute third test case");
    }
}

