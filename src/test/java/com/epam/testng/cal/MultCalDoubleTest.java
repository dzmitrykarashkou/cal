package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalDoubleTest extends BaseTest {
    @Test
    public void twoPointOneMultipleThreePointTwoTest() {
    double result = calculator.mult(2.1, 3.2);
        Assert.assertEquals(result, 6.2, "Invalid result!");
    }
}
