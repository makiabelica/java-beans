import BeansStatefullRemote.IPostVenta;
import BeansStateless.IProducto;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestProductoStateless {
    public static void main(String[] args) {
        testProducto();
    }
    public static void  testProducto(){
        try {

            // Create the InitialContext (automatically loads configuration from jndi.properties)
            Context jdni = new InitialContext();


            // Perform JNDI lookup using the configured properties
            IProducto postVenta = (IProducto) jdni.lookup("java:global/TiendaComestible-1" +
                    ".0-SNAPSHOT/Producto!BeansStateless.IProducto");

            System.out.println("Imprimiendo EJB Local");
            System.out.println("Mostrar Producto ⛳");
            System.out.println(postVenta.mostrarProducto());

            System.out.println("Imprimiendo EJB Remoto");
            System.out.println("Actualizar Producto ⛳");
            System.out.println(postVenta.actualizarProducto("Pieles"));
            System.out.println("Obtener Productos ⛳");
            System.out.println(postVenta.obtenerCantidadProducto());


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
