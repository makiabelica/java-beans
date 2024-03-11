package BeansStatefullRemote;

import BeansStatefullLocal.IInventario;

import javax.ejb.EJB;
import javax.ejb.Stateful;


@Stateful
public class PostVenta implements IPostVenta {
    private double ventaMes;
    private double ventaDia;
    @EJB
    private IInventario inventarioSemanal;
    @Override
    public double totalVentasMes() {
        ventaDia = 1.50;
        ventaMes = ventaDia * 30;
        return ventaMes;
    }

    @Override
    public double totalVentasDias() {
        ventaDia = 2;
        return ventaDia;
    }

    @Override
    public double mostrarVentaSemanal() {
        ventaDia = 60;
        return inventarioSemanal.totalSemanal(ventaDia);
    }
}
