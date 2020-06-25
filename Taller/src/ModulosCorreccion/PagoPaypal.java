
package ModulosCorreccion;

public class PagoPaypal implements Pago{
    private boolean loggedIn;
    @Override
    public void realizarCobro(double monto){
        if (!loggedIn){
            loggedIn = true;
        }
        //cargar el monto de compra al medio de pago
    }
}
