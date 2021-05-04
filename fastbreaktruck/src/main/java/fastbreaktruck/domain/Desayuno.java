package fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import fastbreaktruck.bahaviour.Item;

public class Desayuno {
    private List items = new ArrayList<Item>();
    private float total = 0;

    public List<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void mostrarItem(){
        for(Item item : getItems()){
            System.out.println(item);
        }
    }

    public float getCoste(){
        for (Item item : getItems()) {
            this.total += item.PVP();
        }
        return this.total;
    }    
}
