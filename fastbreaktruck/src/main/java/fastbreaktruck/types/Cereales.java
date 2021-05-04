package fastbreaktruck.types;

import fastbreaktruck.bahaviour.Item;
import fastbreaktruck.bahaviour.Packing;
import fastbreaktruck.domain.Cajas;

public abstract class Cereales implements Item {
    @Override
    public Packing empaquetado(){
        return new Cajas();
    }

    @Override
    public String toString(){
        return empaquetado().envoltorio();
    }
}
