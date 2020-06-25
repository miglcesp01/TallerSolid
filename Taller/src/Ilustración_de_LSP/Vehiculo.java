/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ilustración_de_LSP;

/**
 *
 * @author Yiam
 */
public class Vehiculo {
    private int color;
    private float precio;
    private String modelo;
    private int year;
    private float impuesto;

   
    
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
     public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }
    public float calcularPrecio(){
        return precio*impuesto;
    }
    
    
}
