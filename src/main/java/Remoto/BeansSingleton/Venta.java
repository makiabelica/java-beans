package Remoto.BeansSingleton;

import Local.Util.IInventario;

import javax.ejb.EJB;
import javax.ejb.Singleton;

@Singleton
public class Venta implements IVenta{
    private int cantidadVendidos;
    private float cantidad;
    @EJB
    private IInventario inventario;

    @Override
    public int productosVendidos() {
        cantidadVendidos = 10;
        return inventario.mostrarCantidadVendidas(cantidadVendidos);
    }

    @Override
    public float cantidadProducos() {
        cantidad = 8 * 2;
        return cantidad;
    }

    @Override
    public int obtenerVendidosMensual() {
        cantidadVendidos = 100;
        return inventario.obtenerCantidadVendidosMensuales(cantidadVendidos);
    }

}
