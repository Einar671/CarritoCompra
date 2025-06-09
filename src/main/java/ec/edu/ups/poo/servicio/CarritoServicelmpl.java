package ec.edu.ups.poo.servicio;

import ec.edu.ups.poo.modelo.ItemCarrito;

import java.util.ArrayList;
import java.util.List;

public class CarritoServicelmpl implements ICarritoCompra {
    private List<ItemCarrito> items;

    public CarritoServicelmpl() {
        this.items = new ArrayList<ItemCarrito>();
    }

    @Override
    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }

    @Override
    public List<ItemCarrito> getItems() {
        return items;
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += (item.getCantidad()*item.getProducto().getPrecio());
        }
        return total;
    }
}
