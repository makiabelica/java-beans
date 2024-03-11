package Remoto.BeansSingleton;

import javax.ejb.Remote;

@Remote
public interface IVenta {

    public int productosVendidos();
    public float cantidadProducos();

    public int obtenerVendidosMensual();
}
