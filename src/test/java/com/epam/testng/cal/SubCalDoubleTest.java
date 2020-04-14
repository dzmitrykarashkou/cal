package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalDoubleTest extends BaseTest {
    @Test
    public void twoPointTwoMinusOnePointOneTest() {
        double result = calculator.sub(2.2, 1.1);
        Assert.assertTrue(result ==1.1);
    }
}
