/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern.decorator.externo;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public abstract class Externos extends AutomovilDecorator {
    
    public Externos(VentaAuto ventaAuto) {
        super(ventaAuto);
    }
    
}
