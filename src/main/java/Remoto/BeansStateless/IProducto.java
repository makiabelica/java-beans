package Remoto.BeansStateless;

import javax.ejb.Remote;

@Remote
public interface IProducto {
    public String actualizarProducto(String producto);
    public int  obtenerCantidadProducto();

    public String mostrarProducto();
}
