package com.binge.CMS.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.binge.CMS.factory.VendorFactory;

import com.binge.CMS.persistence.VendorDAO;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

/**
 * Test class for Vendor.
 */
@RunWith(JMockit.class)
public class VendorTest {

  Date  dob;
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
    public final void testVendor() throws ParseException {
      String str_dob = "1999-12-12";
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
      dob = formatter.parse(str_dob);
      Vendor v = new Vendor();Vendor v1 = null;
      Vendor v200 = new Vendor(200,"rama",dob,123456,"rama@gmail.com","rama@123",3000f);
      Vendor v100 = new Vendor(100);
      Vendor v201 = new Vendor(201,"rama",formatter.parse("2000-12-12"),123456,"rama@gmail.com"
      ,"rama@123",3000f);
      v.setVendorId(123);
      assertEquals(123, v.getVendorId());
      assertNotEquals(v100.hashCode(),new Vendor(100));
      assertEquals(v100.hashCode(),new Vendor(100).hashCode());
      assertNull(v1);
      assertEquals(200, v200.getVendorId());
      assertEquals("rama", v200.getVendorName());
      assertEquals(123456, v200.getVendorPhno());
      assertEquals("rama@gmail.com", v200.getVendorEmail());
      assertEquals("rama@123", v200.getVendorPwd());
      assertNotEquals(5000f, v200.getVendorWalBal());
      assertEquals(v201, new Vendor(201,"rama",formatter.parse("2000-12-12"),123456,
      "rama@gmail.com","rama@123",3000f));
      assertNotEquals(v201, new Vendor(201,"ramya",dob,123456,"ramya@gmail.com",
      "ramya@123",3000f));
    }

      /**
   * tests that empty Customer list is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListAllEmpty(@Mocked final VendorDAO dao) {
    new Expectations() {
      {
        dao.show();
        result = new ArrayList<Vendor>();
      }
      };
      new MockUp<VendorFactory>(){
        @Mock
        VendorDAO dao(){
          return dao;
        }
      };

      Vendor vendor[] = VendorFactory.showVendor();
      assertEquals(0, vendor.length);
}
  /**
   * tests that  Customer list  contains some data is handled correctly.
   * @param dao mocking the dao class
   */
public final void testListAllSome(@Mocked final VendorDAO dao) {
  final Vendor v100 = new Vendor();
  final Vendor v101 = new Vendor();
  final ArrayList<Vendor> vendorList = new ArrayList<Vendor>();
  new Expectations() {
    {
      vendorList.add(v100);
      vendorList.add(v101);
      dao.show();
      result = vendorList;
    }
    };
    new MockUp<VendorFactory>(){
      @Mock
      VendorDAO dao(){
        return dao;
      }
    };

    Vendor vendor[] = VendorFactory.showVendor();
    assertEquals(2, vendor.length);
}

@Test
public void testDefaultConstructor() {
  Vendor vendor = new Vendor();
  assertEquals(vendor.hashCode(), new Vendor().hashCode());
}

@Test
public void testGetterVendor() {
  Vendor vendor100 = new Vendor(200,"rama",dob,123456,"rama@gmail.com","rama@123",3000f);

  assertEquals(200,vendor100.getVendorId());
  assertEquals("rama",vendor100.getVendorName());
  assertEquals(dob,vendor100.getVendorDob());
  assertEquals(123456,vendor100.getVendorPhno());
  assertEquals("rama@gmail.com",vendor100.getVendorEmail());
  assertEquals("rama@123",vendor100.getVendorPwd());
  assertNotEquals(3000f,vendor100.getVendorWalBal());
}

@Test
public void testSetterVendor() {
  Vendor vendor100 = new Vendor(200,"rama",dob,123456,"rama@gmail.com","rama@123",3000f);
  Vendor vendor200 = new Vendor();
  vendor200.setVendorId(200);
  assertEquals(vendor100.getVendorId(),vendor200.getVendorId());
  vendor200.setVendorName("rama");
  assertEquals("rama",vendor200.getVendorName());

}
}