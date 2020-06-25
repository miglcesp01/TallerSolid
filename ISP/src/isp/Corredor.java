/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author Yiam
 */
public class Corredor  implements DeportistaCorredor{

    @Override
    public void correr() {
        System.out.println("Corre");
    }

    @Override
    public void saltoLargo() {
        System.out.println("Realiza salto largo");
    }

    @Override
    public void compite() {
        System.out.println("Compite");
    }

    @Override
    public void levantarPesas() {
        System.out.println("Levanta Pesas");
    }

   
    
    
}
