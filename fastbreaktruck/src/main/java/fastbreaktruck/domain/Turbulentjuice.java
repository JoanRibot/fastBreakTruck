package fastbreaktruck.domain;

import fastbreaktruck.types.Bebida;

public class Turbulentjuice extends Bebida {
    private final String nombre= "Turbo Lent Juice";
    private final float price = 30;

    @Override
    public String nombre(){
        return this.nombre;
    }
    @Override
    public float PVP(){
        return this.price;
    }

}
