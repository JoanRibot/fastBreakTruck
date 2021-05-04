package fastbreaktruck.types;

import fastbreaktruck.bahaviour.Item;
import fastbreaktruck.bahaviour.Packing;
import fastbreaktruck.domain.Tubos;

public class Bebida implements Item {
    @Override
    public Packing empaquetado(){
        return new Tubos();
    }

    @Override
    public String toString(){
        return empaquetado().envoltorio();
    }
}
