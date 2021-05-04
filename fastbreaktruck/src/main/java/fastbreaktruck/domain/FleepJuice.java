package fastbreaktruck.domain;

import fastbreaktruck.types.Bebida;

public class FleepJuice extends Bebida{
    private final String nombre= "Fleep Juice";
    private final float price = 35;

    public String nombre(){
        return this.nombre;
    }

    public float price(){
        return this.price;
    }
}
