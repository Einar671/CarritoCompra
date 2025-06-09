package ec.edu.ups.poo.servicio;

import ec.edu.ups.poo.modelo.ItemCarrito;

import java.util.List;

public interface ICarritoCompra {

    void agregarItem(ItemCarrito item);

    List<ItemCarrito> getItems();

    double getTotal();
}