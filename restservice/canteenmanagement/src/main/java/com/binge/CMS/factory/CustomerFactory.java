package com.binge.CMS.factory;

import java.util.Date;
import java.util.List;

import com.binge.CMS.model.Customer;
import com.binge.CMS.persistence.CustomerDAO;
import com.binge.CMS.persistence.DbConnection;

public class CustomerFactory {
    protected CustomerFactory() {

    }
    private static CustomerDAO dao() {
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(CustomerDAO.class);
      }

      public static Customer[] showCustomer() {
        List<Customer> listcustomers = dao().showCustomers();
        return listcustomers.toArray(new Customer[listcustomers.size()]);
      }

      public static int registerNewCustomer(String ucusName,Long ucusPhno,Date ucusDob,String ucusAddr,String ucusEmail,String ucusPassword,float ucusWalletBalance) {
        int result = dao().registerNewCustomer(ucusName,ucusPhno,ucusDob,ucusAddr,ucusEmail,ucusPassword,ucusWalletBalance);
        return result;
      }
      public static Customer customerLogin(String ucusEmail,String ucusPassword) {
        Customer customer = dao().customerLogin(ucusEmail,ucusPassword);
        return customer;
      }

}
