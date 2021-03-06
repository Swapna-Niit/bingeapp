package com.binge.CMS.util;
import java.util.Scanner;
import com.binge.CMS.factory.MenuFactory;
import com.binge.CMS.model.Menu;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * displayUsers method  used to display the users we had in the application.
 */
/*   private void displayUsers() {
    System.out.println("Welcome to Canteen Management System");
    System.out.println("Chooose your role");
    System.out.println("1. Customer");
    
    System.out.println("3. Exit");
    mainMenuDetails();
  } */
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Welcome to Canteen Management System");
    System.out.println("Chooose your role");
    System.out.println("1. Customer");
    System.out.println("2. Vendor");
    System.out.println("3. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    CustomerUtil cusUtil = new CustomerUtil();
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          //showFullMenu();
          cusUtil.enterCustomerPage();
          break;
        case 2:
          //showFullMenu();
          //cusUtil.enterVendorPage();
          break;
        case 3:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
