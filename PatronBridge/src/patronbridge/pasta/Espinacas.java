/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.pasta;

import patronbridge.IProcesar;

/**
 *
 * @author saul enrique camargo
 */
public class Espinacas implements Pasta{
    
    @Override
    public void procesar() {
        cocinarEnBañoMaria();
        System.out.println("Pasta de Espinaca Elaborada");
    }

    @Override
    public void cocinarEnBañoMaria() {
        System.out.println("\nCocinando al Baño maria");
    }
}
