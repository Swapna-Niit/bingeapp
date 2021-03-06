package com.binge.CMS.model;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.integration.junit4.JMockit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;


/**
 * Test class for Vendor.
 */
@RunWith(JMockit.class)
public class CustomerTest {
    /**
     * setup method.
     */
    @Before
    public void initInput() {

    }

    /**
     * Tests the equals/hashcode methods of the Vendor class.
     * 
     * @throws ParseException
     */
    @Test
    public final void testCustomer() throws ParseException {
        Customer m = new Customer();
        Customer m100 = new Customer(100);
        Customer m101 = new Customer(101);
        assertNotEquals(m100, null);
        assertNotEquals(m101, null);
        assertEquals(m100.getCusId(),
            new Customer(100).getCusId());
        m101.setCusId(100);
        assertNotEquals(m101, new Customer(101));
        assertEquals(m100.hashCode(),
            new Customer(100).hashCode());
        assertEquals(m100, new Customer(100));
    }
}
