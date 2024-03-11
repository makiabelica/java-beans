import Remoto.BeansSingleton.IVenta;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestVentaSingleton {
    public static void main(String[] args) {
        testVenta();
    }

    public static void  testVenta(){
        try {

            // Create the InitialContext (automatically loads configuration from jndi.properties)
            Context jdni = new InitialContext();


            // Perform JNDI lookup using the configured properties
            IVenta venta = (IVenta) jdni.lookup("java:global/TiendaComestible-1.0-SNAPSHOT/Venta!Remoto.BeansSingleton" +
                    ".IVenta");

            System.out.println("==== Imprimiendo EJB Local ===");
            System.out.println("VENTA OBTENIDA MENSUAL: " + venta.obtenerVendidosMensual());
            System.out.println("CANTIDAD DE PRODUCTOS VENDIDOS " + venta.productosVendidos());

            System.out.println("=== Imprimiendo EJB Remoto ===");
            System.out.println("STOCK DE PRODUCTOS " + venta.cantidadProducos());


        } catch (NamingException e){
           e.printStackTrace(System.out);
        }
    }

}
