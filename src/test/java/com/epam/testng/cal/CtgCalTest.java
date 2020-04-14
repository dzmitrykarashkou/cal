package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest {
    @Test
    public void ctgThree () {
        double result = calculator.ctg(3);
        Assert.assertEquals(result, 19.081136, "Invalid result!" );
    }
}
