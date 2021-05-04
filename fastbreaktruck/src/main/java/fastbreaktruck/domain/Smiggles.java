package fastbreaktruck.domain;

import fastbreaktruck.types.Cereales;

public class Smiggles extends Cereales {
    private final String nombre= "Turbo Lent Juice";
    private final float price = 50;

    @Override
    public String nombre(){
        return this.nombre;
    }
    @Override
    public float PVP(){
        return this.price;
    }

}
