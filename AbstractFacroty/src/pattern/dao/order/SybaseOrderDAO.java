/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/


package pattern.dao.order;

import pattern.interfaces.OrderDAO;

public class SybaseOrderDAO implements OrderDAO {

    @Override
    public int insertOrder() {
        return 1;
    }

    @Override
    public boolean deleteOrder() {
        return true;
    }

    @Override
    public String findOrder() {
        return "SybaseOrderDAO findOrder";
    }
}
