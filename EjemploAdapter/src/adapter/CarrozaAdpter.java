/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import adapter.old_arquitecture.Carroza;
import back.Carro;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class CarrozaAdpter extends Carro{

    private Carroza carroza = new Carroza();
    
    @Override
    public void frenar() {
        carroza.halarRiendas();
    }

    @Override
    public void acelerar() {
        carroza.movelRiendas();
        carroza.arrearCaballos();
    }
    
}
