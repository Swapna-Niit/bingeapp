package com.binge.CMS.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.binge.CMS.factory.CustomerFactory;
import com.binge.CMS.factory.MenuFactory;
import com.binge.CMS.model.Customer;
import com.binge.CMS.model.Menu;

public class CustomerUtil {

    private final Scanner option = new Scanner(System.in, "UTF-8");
    //private int ucusId;
    private String ucusName;
    private Long ucusPhno;
    private String ucusDob;
    //private String ucusAddr;
    private String ucusEmail;
    private String ucusPassword;
    private int ucusWalletBalance;
    private Date date_dob;
    CliMain cm = new CliMain();
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
                    CustomerFactory.addCustomer(ucusName, ucusPhno, ucusEmail, ucusWalletBalance, ucusPassword, date_dob);
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
            Customer existingcustomer =CustomerFactory.check(pucusEmail, pucusPassword); 
            if(existingcustomer != null) {
                System.out.println("Customer logged in successfully");
                System.out.println(" Please choose choice ....... ");
                System.out.println("           1.Personal Details            ");
                System.out.println("           2.Wallet Recharge             ");
                System.out.println("           3.Place Order            ");
                System.out.println(" Enter the choice: ");
                int cus_choice = option.nextInt();
                switch(cus_choice) {
                case 1 :
                showPersonalDetails();
                case 2 :
                rechargeWallet();
                case 3 :
                placeOrder();
                
            }
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



    private void placeOrder() {
        try {

            System.out.println("Ready to place the order");
            System.out.println("Choose from following Menu");
            showFullMenu();
            System.out.println("Enter the food id");
            int ofoodid = option.nextInt();
            System.out.println("Enter the quantity");
            int ofoodqty = option.nextInt();
            System.out.println("Total amount is");
            Menu m = MenuFactory.showMenuById(ofoodid);
            int ofoodprice = m.getFoodCost();
            int totalAmount = ofoodprice *ofoodqty;
            //int newWallentBal =  m.get
            //deductWalletBalance method
            //OrderFac
            System.out.println("successfully placed the order....");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    
    private void rechargeWallet() {
        try {

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void showPersonalDetails() {
        try {

        }
        catch(Exception e) {
            e.printStackTrace();
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

        //System.out.println("Enter the address  ");
        //ucusAddr = option.next();
        System.out.println("Enter the email  ");
        ucusEmail = option.next();;
        System.out.println("Enter the password  ");
        ucusPassword = option.next();
        System.out.println("Enter the wallet balance to recharge ");
        ucusWalletBalance = option.nextInt();
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
    /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu_Id");
    for (Menu m : menu) {
      System.out.println(m.getFoodId());
    }
  }
}
