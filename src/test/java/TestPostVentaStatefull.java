import Remoto.BeansStateful.IPostVenta;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestPostVentaStatefull {
    public static void main(String[] args) {
        testPostVenta();
    }

    public static void  testPostVenta(){
        try {
            Context jdni = new InitialContext();


            IPostVenta postVenta = (IPostVenta) jdni.lookup("java:global/TiendaComestible-1" +
                    ".0-SNAPSHOT/PostVenta!Remoto.BeansStateful.IPostVenta");

            System.out.println("Imprimiendo EJB Local");
            System.out.println("Post Venta Semanal ⛳");
            System.out.println(postVenta.mostrarVentaSemanal());

            System.out.println("Imprimiendo EJB Remoto");
            System.out.println("Post Venta Dias ⛳");
            System.out.println(postVenta.totalVentasDias());
            System.out.println("Post Venta Mes ⛳");
            System.out.println(postVenta.totalVentasMes());


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
