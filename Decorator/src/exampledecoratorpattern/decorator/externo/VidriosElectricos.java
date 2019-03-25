package exampledecoratorpattern.decorator.externo;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class VidriosElectricos extends Externos {
     //Constructor se envia el paramatrea al metodo
     public VidriosElectricos(VentaAuto ventaAuto){
        //permite acumular
         super(ventaAuto);
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tVidrios Eléctricos";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice()+ 200000;
    }
    
}
