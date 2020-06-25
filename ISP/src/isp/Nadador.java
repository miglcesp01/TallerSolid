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
public class Nadador implements DeportistaNadador{

    @Override
    public void compite() {
        System.out.println("Compite");
    }

    @Override
    public void levantarPesas() {
        System.out.println("Levanta pesas");
    }

    @Override
    public void nadar() {
        System.out.println("Nada");
    }

    @Override
    public void practicaEstilo() {
        System.out.println("Practica estilo");
    }

   
}
