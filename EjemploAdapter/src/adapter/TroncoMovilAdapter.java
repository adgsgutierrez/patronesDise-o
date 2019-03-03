/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.old_arquitecture.TroncoMovil;
import back.Carro;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class TroncoMovilAdapter extends Carro{

    private TroncoMovil troncoMovil = new TroncoMovil();
    
    @Override
    public void frenar() {
        troncoMovil.bajarPies();
        troncoMovil.rozarPies();
    }

    @Override
    public void acelerar() {
        troncoMovil.bajarPies();
        troncoMovil.correr();
    }
       
    
}
