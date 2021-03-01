package com.binge.CMS.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.binge.CMS.factory.CustomerFactory;
import com.binge.CMS.model.Customer;

public class CustomerUtil {

    private final Scanner option = new Scanner(System.in, "UTF-8");
    //private int ucusId;
    private String ucusName;
    private Long ucusPhno;
    private String ucusDob;
    private String ucusAddr;
    private String ucusEmail;
    private String ucusPassword;
    private float ucusWalletBalance;
    private Date date_dob;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    public final void enterCustomerPage(){

        System.out.println("================================");
        System.out.println("          Welcome to CMS        ");
        System.out.println("================================");
        System.out.println("        Customer Transactions   ");
        System.out.println("           1.Signup             ");
        System.out.println("           2.login              ");
        System.out.println(" Please choose 1 to SignUp if you are new Customer ");
        System.out.println(" Enter the choice: ");  
        int choice = option.nextInt();
        switch(choice) {

            case 1 :
                boolean done =readCustomerValues(); 

                if(done) {
                    CustomerFactory.registerNewCustomer(ucusName,ucusPhno,date_dob,
                    ucusAddr,ucusEmail,ucusPassword,ucusWalletBalance);
                }else {
                    System.out.println("Try again...");
                }
                break;
            case 2:
            System.out.println("Enter details to login as Customer");
            System.out.println("Enter the email as Username to login");
            String pucusEmail = option.next();
            System.out.println("Enter the password  to login");
            String pucusPassword = option.next();
            Customer existingcustomer =CustomerFactory.customerLogin(pucusEmail, pucusPassword); 
            if(existingcustomer != null) {
                System.out.println("Customer logged in successfully");
                System.out.println(" Please choose choice ....... ");
                System.out.println("           1.Personal Details            ");
                System.out.println("           2.Wallet Recharge             ");
                System.out.println("           3.Place Order            ");
                System.out.println(" Enter the choice: ");
                int cus_choice = option.nextInt();
                
            }
            else {
                System.out.println("Sorry.....check your user name and password");
            }
            break;
            case 3:
              Runtime.getRuntime().halt(0);
              break;
            default:
              System.out.println("no case found");
        }

    }



    public boolean readCustomerValues() {
        try {
        System.out.println("Enter details to register as new Customer");
        System.out.println("Enter the Name");
        ucusName = option.next();
        System.out.println("Enter the Phone Number");
        ucusPhno = option.nextLong();
        System.out.println("Enter ur Date Of Birth (yyyy-mm-dd): ");
        ucusDob = option.next();
            try {
                date_dob = formatter.parse(ucusDob);

            }
            catch(ParseException pe) {
                pe.printStackTrace();
            }

        System.out.println("Enter the address  ");
        ucusAddr = option.next();
        System.out.println("Enter the email  ");
        ucusEmail = option.next();;
        System.out.println("Enter the password  ");
        ucusPassword = option.next();
        System.out.println("Enter the wallet balance to recharge ");
        ucusWalletBalance = option.nextFloat();
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
        finally {
            System.out.println("details entered by customer");
        }

        return true;
        
    }
    
}
