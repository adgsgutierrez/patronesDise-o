/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.factories;

import pattern.DAOFactory;
import pattern.dao.account.OracleAccountDAO;
import pattern.dao.customer.OracleCustomerDAO;
import pattern.dao.order.OracleOrderDAO;
import pattern.interfaces.AccountDAO;
import pattern.interfaces.CustomerDAO;
import pattern.interfaces.OrderDAO;

public class OracleDAOFactory extends DAOFactory {
    
    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new OracleCustomerDAO();
    }

    public AccountDAO getAccountDAO() {
        // CloudscapeAccountDAO implements AccountDAO
        return new OracleAccountDAO();
    }

    public OrderDAO getOrderDAO() {
        // CloudscapeOrderDAO implements OrderDAO
        return new OracleOrderDAO();
    }
}
