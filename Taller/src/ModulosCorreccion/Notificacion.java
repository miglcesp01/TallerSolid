package Modulos;

public class Notificacion {
    private int tipoNotificacion;
    public void notificar(Pago pago){
        if(tipoNotificacion==1){
            //enviarMail
        }else{
            //enviarSms
        }
    }
}