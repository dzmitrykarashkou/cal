package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalLongTest extends BaseTest{
    @Test
    public void twoMultipleThreeTest () {
        long result = calculator.mult(2, 3);
        Assert.assertEquals(result, 6, "Invalid result!");
    }
}
