/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern;

import pattern.factories.CloudscapeDAOFactory;
import pattern.factories.OracleDAOFactory;
import pattern.factories.SybaseDAOFactory;
import pattern.interfaces.CustomerDAO;
import pattern.interfaces.AccountDAO;
import pattern.interfaces.OrderDAO;

public abstract class DAOFactory {

  // List of DAO types supported by the factory
  public static final int CLOUDSCAPE = 1;
  public static final int ORACLE = 2;
  public static final int SYBASE = 3;


  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
  public abstract CustomerDAO getCustomerDAO();
  public abstract AccountDAO getAccountDAO();
  public abstract OrderDAO getOrderDAO();

  public static DAOFactory getDAOFactory(int whichFactory) {
    System.out.println("whichFactory" + whichFactory);
    switch (whichFactory) {
      case CLOUDSCAPE: 
          return new CloudscapeDAOFactory();
      case ORACLE    : 
          return new OracleDAOFactory();      
      case SYBASE    : 
          return new SybaseDAOFactory();
      default: 
          return null;
    }
  }
}
