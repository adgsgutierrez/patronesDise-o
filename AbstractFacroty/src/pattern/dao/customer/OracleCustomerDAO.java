/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.dao.customer;

import pattern.interfaces.CustomerDAO;

public class OracleCustomerDAO implements CustomerDAO {

    @Override
    public int insertCustomer() {
        return 5;
    }

    @Override
    public boolean deleteCustomer() {
        return true;
    }

    @Override
    public String findCustomer() {
        return "OracleCustomerDAO findCustomer";
    }
}
