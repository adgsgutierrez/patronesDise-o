package exampledecoratorpattern.decorator.externo;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class LlantasLujo extends Externos{
    //Constructor se envia el paramatrea al metodo
    public LlantasLujo(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tLlantas de lujo";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice()+ 1000000;
    }
}
