package com.stackroute.wave4;

import com.stackroute.wave4.Factorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest
{
    Factorial f1;

    @Before
    public void setUp()
    {
        f1 = new Factorial();
    }
    @After
    public void tearDown() throws Exception
    {
        f1 = null;
    }
    @Test
    public void getFactorial1Success()
    {
        String actualStr = f1.getFactorial(2);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void getFactorial2Success()
    {
        String actualStr = f1.getFactorial(4);
        String expectedStr = "The factorial of 1 is 1\n" + "The factorial of 2 is 2\n" + "The factorial of 3 is 6\n" + "The factorial of 4 is 24\n";
        assertEquals(actualStr,expectedStr);
    }
}
