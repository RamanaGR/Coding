package com.edu.classes.testng;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test is started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("take screenshot");
        //take screeenshot
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
