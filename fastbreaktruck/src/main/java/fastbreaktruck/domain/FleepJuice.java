package fastbreaktruck.domain;

import fastbreaktruck.types.Bebida;

public class FleepJuice extends Bebida{
    private final String nombre= "Fleep Juice";
    private final float price = 35;

    @Override
    public String nombre(){
        return this.nombre;
    }
    @Override
    public float PVP(){
        return this.price;
    }
}
