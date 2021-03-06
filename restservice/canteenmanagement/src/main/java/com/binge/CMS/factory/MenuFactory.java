package com.binge.CMS.factory;

import com.binge.CMS.persistence.MenuDAO;
import com.binge.CMS.persistence.DbConnection;
import java.util.List;

import com.binge.CMS.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().showMenu();
    return menu.toArray(new Menu[menu.size()]);
  }

    /**
   * Call the data base connection.
   * @return a menu object.
   */
  public static Menu showMenuById(int fid) {
    Menu menu = dao().showMenuById(fid);
    return menu;
  }
}
