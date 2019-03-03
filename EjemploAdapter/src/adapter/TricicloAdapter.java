/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.old_arquitecture.Triciclo;
import back.Carro;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class TricicloAdapter extends Carro{

    private Triciclo triciclo = new Triciclo();
    
    @Override
    public void frenar() {
        triciclo.bajarPies();
        triciclo.rozarPies();
    }

    @Override
    public void acelerar() {
        triciclo.pedalear();
    }
    
}
