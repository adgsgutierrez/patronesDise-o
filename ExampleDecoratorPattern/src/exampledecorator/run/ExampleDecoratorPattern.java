package exampledecorator.run;

import exampledecoratorpattern.VentaAuto;
import exampledecoratorpattern.components.*;
import exampledecoratorpattern.decorator.*;

public class ExampleDecoratorPattern {
    //Cliente
    public static void main(String[] args) {
        //Vehiculos
        VentaAuto automovil = new ChevroletSail();
        //VentaAuto automovil = new BMW();
        //VentaAuto automovil = new ChevroletSprint();
        //VentaAuto automovil = new Toyota();
        
        //Decoradores
        automovil = new AireAcondicionado(automovil);
        automovil = new Blindaje(automovil);
        automovil = new LlantasLujo(automovil);
        automovil = new Mp4Player(automovil);
        automovil = new Polarizado(automovil);
        automovil = new RadioBasico(automovil);
        automovil = new RadioDVD(automovil);
        automovil = new RadioGPS(automovil);
        automovil=new VidriosElectricos(automovil);        
        
        System.out.println(automovil.getDescription());
        System.out.println("Su precio es: "+ automovil.getPrice());
          
    }
    
}
