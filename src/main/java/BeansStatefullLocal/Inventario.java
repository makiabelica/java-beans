package BeansStatefullLocal;

import javax.ejb.Stateful;

@Stateful
public class Inventario implements IInventario{
    @Override
    public int mostrarCantidadVendidas(int cantidad) {
        return cantidad;
    }

    @Override
    public double totalSemanal(double ventaDia) {
        return ventaDia * 5;
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
