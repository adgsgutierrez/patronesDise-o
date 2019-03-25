package exampledecoratorpattern.decorator.interno;

import exampledecoratorpattern.AutomovilDecorator;
import exampledecoratorpattern.VentaAuto;

public class Mp4Player extends Radios{
    //Constructor se envia el paramatrea al metodo
    public Mp4Player(VentaAuto ventaAuto){
        super(ventaAuto);
    }
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public String getDescription(){
        return getVentaAuto().getDescription() + "\n\tReproductor Mp4";
    }
    //Metodos que retornan del componente y del decorador concreto
    @Override
    public float getPrice(){
        return getVentaAuto().getPrice()+ 400000;
    }
}
