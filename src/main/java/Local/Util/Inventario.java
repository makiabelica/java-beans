package Local.Util;

import Local.Lib.IIVentarioLib;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class Inventario implements IInventario{

    @EJB
    private IIVentarioLib inventarioLib;

    @Override
    public int mostrarCantidadVendidas(int cantidad) {
        return cantidad;
    }

    @Override
    public double totalSemanal(double ventaDia) {
        return inventarioLib.totalSemanal(ventaDia);
    }

    @Override
    public String mostrarProducto(String producto) {
        return producto;
    }

    @Override
    public int obtenerCantidadVendidosMensuales(int cantidadVendido) {
        return cantidadVendido;
    }
}
