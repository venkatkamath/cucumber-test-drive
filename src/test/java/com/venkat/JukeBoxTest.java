package com.venkat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals(48,credit);

    }
}