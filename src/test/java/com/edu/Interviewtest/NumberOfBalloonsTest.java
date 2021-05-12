package com.edu.Interviewtest;

import com.edu.interview.NumberOfBalloons;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class NumberOfBalloonsTest {
    NumberOfBalloons bal;

    @BeforeClass
    public void setUp() {
        bal = new NumberOfBalloons();
    }

    @Test
    public void shouldMatchOnlyOne() {
        int actual = bal.maxNumberOfBalloons("ONLABQAWAXXOLL");
        int actual1 = bal.maxNumberOfBalloonsWithHM("ONLABQAWAXXOLL");
        assertEquals(actual1, 1);
    }

}



