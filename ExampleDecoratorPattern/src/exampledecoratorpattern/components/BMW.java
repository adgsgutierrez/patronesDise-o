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
public class BMW extends Automovil {
    //Metodos de la clase retorna un String
    @Override
    public String getDescription(){
        return "BMW , Modelo 2019, Color negro mate";
    }
    //Metodos de la clase retorna un Int
    @Override
    public float getPrice(){
        return 140000000;
    }
}