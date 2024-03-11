package BeansStatefullRemote;

import javax.ejb.Remote;

@Remote
public interface IPostVenta {
    public double totalVentasMes();
    public double totalVentasDias();

    public double mostrarVentaSemanal();
}
