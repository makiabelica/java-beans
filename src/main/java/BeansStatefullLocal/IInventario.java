package BeansStatefullLocal;

import javax.ejb.Local;

@Local
public interface IInventario {
    public int mostrarCantidadVendidas(int cantidad);
    public double totalSemanal(double ventaDia);

    public String mostrarProducto(String producto);

    public int obtenerCantidadVendidosMensuales(int cantidadVendido);
}
