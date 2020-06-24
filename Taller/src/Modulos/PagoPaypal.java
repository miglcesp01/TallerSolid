
package Modulos;

public class PagoPaypal extends Pago{
    private boolean loggedIn;
    @Override
    public void realizarCobro(double monto){
        if (!loggedIn){
            return;
        }
        //cargar el monto de compra al medio de pago
    }
}
