/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern.decorator.interno;

import exampledecoratorpattern.decorator.interno.Internos;
import exampledecoratorpattern.VentaAuto;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public abstract class Radios  extends Internos  {
    
    public Radios(VentaAuto ventaAuto) {
        super(ventaAuto);
    }
    
}
