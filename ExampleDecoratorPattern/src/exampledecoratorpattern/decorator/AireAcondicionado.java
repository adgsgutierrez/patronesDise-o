package exampledecoratorpattern.decorator;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;
import exampledecoratorpattern.VentaAuto;

public class AireAcondicionado extends AutomovilDecorator{
    //Constructor se envia el paramatrea al metodo
    public AireAcondicionado(VentaAuto ventaAuto){
        //permite acumular
        super(ventaAuto);
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tAire Acondicionado";
    }
     //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice() + 800000;
    }
}
