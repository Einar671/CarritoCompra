package ec.edu.ups.poo;

import java.util.ArrayList;
import java.util.List;

public class CarritoComprasAgregar {
    private List<ItemCarrito> items;

    public CarritoComprasAgregar() {
        this.items = new ArrayList<ItemCarrito>();
    }

    public void agregarItem(ItemCarrito item) {
        this.items.add(item);
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}
