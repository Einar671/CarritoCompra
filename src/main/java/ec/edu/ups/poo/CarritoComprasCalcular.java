package ec.edu.ups.poo;

import java.util.List;

public class CarritoComprasCalcular {

    public double getTotal(CarritoComprasAgregar agregar) {
        double total = 0;
        List<ItemCarrito> items = agregar.getItems();

        for (ItemCarrito item : items) {
            if (item != null && item.getProducto() != null) {
                total += item.getCantidad() * item.getProducto().getPrecio();
            }
        }

        return total;
    }
}
