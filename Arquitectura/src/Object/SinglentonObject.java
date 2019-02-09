/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.Date;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class SinglentonObject {
 
    private static volatile SinglentonObject object = null;
    public static Date creado;

    private SinglentonObject(){
    }
    
    public static SinglentonObject getInstance(){
        if(object == null){
            creado = new Date();
            object = new SinglentonObject();
        }
        return object;
    }
}
