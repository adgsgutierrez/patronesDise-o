/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronbridge.hamburguesa;

/**
 *
 * @author aricdayangutierrezsanchez
 */
public class Vegetariana implements Hamburguesa{

    @Override
    public void preparacionCubierta() {
        System.out.println("Preparando Arepa");
    }

    @Override
    public void procesar() {
        preparacionCubierta();
        System.out.println("Hamburguesa Vegetariana Procesada");
    }
    
}