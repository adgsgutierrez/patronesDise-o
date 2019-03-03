/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.factories;

import pattern.DAOFactory;
import pattern.dao.account.SybaseAccountDAO;
import pattern.dao.customer.SybaseCustomerDAO;
import pattern.dao.order.SybaseOrderDAO;
import pattern.interfaces.AccountDAO;
import pattern.interfaces.CustomerDAO;
import pattern.interfaces.OrderDAO;

public class SybaseDAOFactory extends DAOFactory {
    
    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new SybaseCustomerDAO();
    }

    public AccountDAO getAccountDAO() {
        // CloudscapeAccountDAO implements AccountDAO
        return new SybaseAccountDAO();
    }

    public OrderDAO getOrderDAO() {
        // CloudscapeOrderDAO implements OrderDAO
        return new SybaseOrderDAO();
    }
}
