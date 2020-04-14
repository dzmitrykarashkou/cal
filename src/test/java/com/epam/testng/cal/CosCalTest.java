package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {
    @Test
    public void cosThree () {
        double result = calculator.cos(3);
        Assert.assertEquals(result, 0.998629, "Invalid result!");
    }

}
