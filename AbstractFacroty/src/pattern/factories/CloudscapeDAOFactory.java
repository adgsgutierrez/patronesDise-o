/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 * */
package pattern.factories;

import pattern.DAOFactory;
import pattern.dao.account.CloudscapeAccountDAO;
import pattern.dao.customer.CloudscapeCustomerDAO;
import pattern.dao.order.CloudscapeOrderDAO;
import pattern.interfaces.AccountDAO;
import pattern.interfaces.CustomerDAO;
import pattern.interfaces.OrderDAO;

public class CloudscapeDAOFactory extends DAOFactory {

    public CustomerDAO getCustomerDAO() {
        // CloudscapeCustomerDAO implements CustomerDAO
        return new CloudscapeCustomerDAO();
    }

    public AccountDAO getAccountDAO() {
        // CloudscapeAccountDAO implements AccountDAO
        return new CloudscapeAccountDAO();
    }

    public OrderDAO getOrderDAO() {
        // CloudscapeOrderDAO implements OrderDAO
        return new CloudscapeOrderDAO();
    }

}
