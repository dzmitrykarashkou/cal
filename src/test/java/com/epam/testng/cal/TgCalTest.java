package com.epam.testng.cal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest {
    @Test
    public void tgthree () {
        double result = calculator.tg(3);
        Assert.assertEquals(result, 0.052407, "Invalid result!");
    }

}
