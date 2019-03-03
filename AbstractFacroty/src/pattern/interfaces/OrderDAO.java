/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.interfaces;

public interface OrderDAO {
    
    public int insertOrder();
    public boolean deleteOrder();
    public String findOrder();

}
