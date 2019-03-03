/**
 * Create by Aric Gutierrez
 * date : 20 feb 2019
 * Fundación Universitaria Konrad Lorenz
 **/

package pattern.dao.account;

import pattern.interfaces.AccountDAO;

public class SybaseAccountDAO implements AccountDAO {

    @Override
    public int insertAccount() {
        return 7;
    }

    @Override
    public boolean deleteAccount() {
        return true;
    }

    @Override
    public String findAccount() {
        return "SybaseAccountDAO findAccount";
    }
}
