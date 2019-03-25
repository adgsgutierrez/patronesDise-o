/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern.decorator;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class Polarizado extends AutomovilDecorator {
     //Constructor se envia el paramatrea al metodo
     public Polarizado(VentaAuto ventaAuto){
        //permite acumular
         super(ventaAuto);
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tPolarizado";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice()+ 800000;
    }
    
}
