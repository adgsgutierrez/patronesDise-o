/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class StartPattern {
    
    
    public static void main(String[] args){

	DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.SYBASE);
        
        System.out.println("Account Factory findAccount " + daoFactory.getAccountDAO().findAccount());
        System.out.println("Account Factory deleteAccount " + daoFactory.getAccountDAO().deleteAccount());
	System.out.println("Account Factory insertAccount " + daoFactory.getAccountDAO().insertAccount());
        
        System.out.println("Customer Factory findCustomer " + daoFactory.getCustomerDAO().findCustomer());
        System.out.println("Customer Factory deleteCustomer " + daoFactory.getCustomerDAO().deleteCustomer());
	System.out.println("Customer Factory insertCustomer " + daoFactory.getCustomerDAO().insertCustomer());
        
        System.out.println("Order Factory findOrder " + daoFactory.getOrderDAO().findOrder());
        System.out.println("Order Factory deleteOrder " + daoFactory.getOrderDAO().deleteOrder());
	System.out.println("Order Factory insertOrder " + daoFactory.getOrderDAO().insertOrder());
    }
}
