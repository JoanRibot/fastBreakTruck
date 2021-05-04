package fastbreaktruck.bahaviour;

import fastbreaktruck.domain.Desayuno;
import fastbreaktruck.domain.Eyeholes;
import fastbreaktruck.domain.FleepJuice;
import fastbreaktruck.domain.Smiggles;
import fastbreaktruck.domain.Turbulentjuice;

public class FastBreakTruck {
    // menus
    public static Desayuno prepararEyeHoles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Eyeholes());
        desayuno.addItem(new Turbulentjuice());
        return desayuno;
    }

    public static Desayuno prepararSmiggles() {
        Desayuno desayuno = new Desayuno();
        desayuno.addItem(new Smiggles());
        desayuno.addItem(new FleepJuice());
        return desayuno;
    }
    
}
