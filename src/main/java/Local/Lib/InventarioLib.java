package Local.Lib;

import javax.ejb.Stateful;

@Stateful
public class InventarioLib implements IIVentarioLib {
    @Override
    public double totalSemanal(double ventaDia) {
        return ventaDia * 5;
    }
}
