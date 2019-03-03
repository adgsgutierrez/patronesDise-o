/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/


package pattern.interfaces;

public interface CustomerDAO {
    
    public int insertCustomer();
    public boolean deleteCustomer();
    public String findCustomer();
}
