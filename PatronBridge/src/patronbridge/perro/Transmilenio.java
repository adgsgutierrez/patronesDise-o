/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.perro;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class Transmilenio implements PerroCaliente{

    @Override
    public void preparacionPan() {
        System.out.println("Expansion de pan realizada");
    }

    @Override
    public void procesar() {
        preparacionPan();
        System.out.println("Perro caliente Transmilenio Procesada");
    }
    
}