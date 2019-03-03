/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

/**
 *
 * @author Dairo
 */

//Adapter
public class BatiMovilAdaptado extends Carro{
    final BatiMovil batiMovil = new BatiMovil();
    
    @Override
    public void frenar() {
        batiMovil.batiFrenado();
    }

    @Override
    public void acelerar() {
        batiMovil.batiAceleado();
    }
    
}
