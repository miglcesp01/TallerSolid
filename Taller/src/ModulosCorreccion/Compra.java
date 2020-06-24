package ModulosCorreccion;
public class Compra {
    private Pago pago;
    private List articulos;
    private Factura factura;    
    public Compra(Pago pago){
        //inicialziaciones
        //Se utiliza la lista de articulos para calcular el monto total
        //La clase que implemente pago se encargara de realizar el cobro
        //El objeto factura con el monto total generará la factura
    }

    public void agregarArticulo(Articulo articulo){
        //agregar un articulo de compra
    }

    public void removerArticulo(Articulo articulo){
        //remover una articulo de compra
    }
    
}