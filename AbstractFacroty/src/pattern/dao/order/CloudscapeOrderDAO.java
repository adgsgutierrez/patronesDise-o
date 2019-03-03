/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.dao.order;

import pattern.interfaces.OrderDAO;

public class CloudscapeOrderDAO implements OrderDAO {

    @Override
    public int insertOrder() {
        return 3;
    }

    @Override
    public boolean deleteOrder() {
        return true;
    }

    @Override
    public String findOrder() {
        return "CloudscapeOrderDAO findOrder";
    }
}
