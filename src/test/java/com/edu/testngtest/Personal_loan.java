package com.edu.testngtest;

import org.testng.Assert;
import org.testng.annotations.*;

public class Personal_loan {
    /* @BeforeClass
     public void beforeClass() {
         System.out.println("Before Class invoked");
     }
     @BeforeTest
     public void beforeTest() {
         System.out.println("Before Test Invoked");
     }
     @BeforeSuite
     public void beforeSuite() {
         System.out.println("Before Suite Invoked");
     }

     @AfterClass
     public void afterClass() {
         System.out.println("AfterClass invoked");
     }

     @BeforeMethod
     public void beforeMethod() {
         System.out.println("Before Method invoked");
     }
 */
    @Test(priority = 0)
    public void webLoginPersonalLoan() {
        System.out.println("Web Login Personal Loan");
    }

    @Test(priority = 5)
    public void mobileLoginPersonalLoan() {
        Assert.fail();
        System.out.println("Mobile Login Personal Loan");
      /*  String str = "";
        for (int i = 0; i <= 1000; i++) {
            str += String.valueOf(i);
        }
        System.out.println(str);*/
    }

    @Test(priority = -3, description = "API Login for Personal Loan Page")
    public void aPILoginPersonalLoan() {
        System.out.println("API Login Personal Loan");
    }
}

