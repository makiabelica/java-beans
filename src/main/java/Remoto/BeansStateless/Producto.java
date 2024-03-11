package Remoto.BeansStateless;

import Local.Util.IInventario;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class Producto implements IProducto{
    private int cantidad;
    private String producto;
    @EJB
    private IInventario inventario;

    @Override
    public String actualizarProducto(String  nuevoProducto) {
        producto = nuevoProducto;
        return producto;
    }

    @Override
    public int obtenerCantidadProducto() {
        cantidad = 20;
        return cantidad;
    }

    @Override
    public String mostrarProducto() {
        producto = "Caracoles 🐿️";
        return inventario.mostrarProducto(producto);
    }
}
