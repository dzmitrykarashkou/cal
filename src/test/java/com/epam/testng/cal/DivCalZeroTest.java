package com.epam.testng.cal;

import org.testng.annotations.Test;

public class DivCalZeroTest extends BaseTest {
    @Test
    public void threeDivisionZero() {
        long a = 3, b = 0;
        long result = calculator.div(a, b);
        if (b == 0L) {
            throw new NumberFormatException("Attempt to divide by zero");
        }
    }
}