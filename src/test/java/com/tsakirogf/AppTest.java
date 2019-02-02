package com.tsakirogf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.tsakirogf.controller.HomeController;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testHome()
    {
        HomeController hc = new HomeController();
        assertEquals("Das Boot, reporting for duty.", hc.home());
    }
}
