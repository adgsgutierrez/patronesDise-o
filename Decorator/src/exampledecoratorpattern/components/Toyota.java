/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern.components;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class Toyota extends Automovil {

    @Override
    public String getDescription() {
        return "Mazda 3 , modelo 2020 , negro mate";
    }

    @Override
    public float getPrice() {
        return 120000000;
    }

}
