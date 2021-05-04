package fastbreaktruck.domain;

import fastbreaktruck.bahaviour.Packing;

public class Cajas implements Packing{

    @Override
    public String envoltorio(){
        return "caja";
    }
    
}