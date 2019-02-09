
import Object.SinglentonObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class Singlenton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglentonObject objectA = SinglentonObject.getInstance();
        System.out.println("Object A " + objectA + " creado el "+objectA.creado);
        SinglentonObject objectB = SinglentonObject.getInstance();
        System.out.println("Object B " + objectB + " creado el "+objectB.creado);
        SinglentonObject objectC = SinglentonObject.getInstance();
        System.out.println("Object C " + objectC + " creado el "+objectC.creado);
        SinglentonObject objectD = SinglentonObject.getInstance();
        System.out.println("Object D " + objectD + " creado el "+objectD.creado);
        
    }
    
}
