/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import adapter.CarrozaAdpter;
import adapter.TricicloAdapter;
import adapter.TroncoMovilAdapter;
import back.*;
import java.util.Scanner;

/**
 *
 * @author Dairo
 */

//Client
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Carro carro = null;
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            System.out.println("");
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            System.out.println("Seleccione el carro que desea conducir");
            System.out.println("1. Carro Normal");
            System.out.println("2. Carro de Batman");
            System.out.println("3. Carroza");
            System.out.println("4. Triciclo");
            System.out.println("5. Tronco Móvil");
            System.out.println("6. Salir");            
            System.out.println("");
            int opcion = sc.nextInt();
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            
            switch (opcion) {
                case 1:
                    carro = new CarroNormal();        
                    break;
                case 2:
                    carro = new BatiMovilAdaptado();        
                    break;
                case 3:
                    carro = new CarrozaAdpter();        
                    break;
                case 4:
                    carro = new TricicloAdapter();        
                    break;
                case 5:
                    carro = new TroncoMovilAdapter();        
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("La seleccionada no existe");
                    break;
            }
            if(carro != null){
                carro.acelerar();
                carro.frenar();
            }
        }
    }
    
}
