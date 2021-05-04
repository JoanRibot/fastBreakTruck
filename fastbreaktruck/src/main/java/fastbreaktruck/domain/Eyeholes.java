package fastbreaktruck.domain;

import fastbreaktruck.types.Cereales;

public class Eyeholes extends Cereales {
    private final String nombre= "Turbo Lent Juice";
    private final float price = 25;

    @Override
    public String nombre(){
        return this.nombre;
    }
    @Override
    public float PVP(){
        return this.price;
    }

}