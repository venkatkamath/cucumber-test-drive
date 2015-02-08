package com.venkat;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JukeBoxTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculateCredits() throws Exception {
        JukeBox box = new JukeBox();
        int credit  = box.calculateCredits(12);
        Assert.assertEquals(48, credit);

    }
}