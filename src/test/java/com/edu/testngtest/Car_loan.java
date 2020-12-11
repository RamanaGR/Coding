package com.edu.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Car_loan {
    @Test
    public void WebLoginCarLoan() {
        System.out.println("Web Login Home Loan");
        Assert.fail();
    }

    @Test
    public void MobileLoginCarLoan() {
        System.out.println("Mobile Login Home Loan");
    }

    @Test(groups = {"SanityTest"})
    public void APILoginCarLoan() {
        System.out.println("API Login Home Loan");
    }
}
