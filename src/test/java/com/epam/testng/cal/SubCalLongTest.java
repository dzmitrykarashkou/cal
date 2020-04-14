package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalLongTest extends BaseTest{
    @Test
    public void twoMinusOne() {
        long result = calculator.sub(2, 1);
        Assert.assertTrue(result == 1);
    }
}
