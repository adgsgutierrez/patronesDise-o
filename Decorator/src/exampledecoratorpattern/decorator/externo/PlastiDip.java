/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern.decorator.externo;

import exampledecoratorpattern.VentaAuto;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class PlastiDip extends Externos{
    //Constructor se envia el paramatrea al metodo
    public PlastiDip(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tPlastiDip Azul";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice()+ 500000;
    }
}
