/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.ArrayList;

/**
 *
 * @author carloshumbertomenesesmurillo
 */
public class FiltroPersona extends FiltroEspecificaciones {
    private String nombre;

    public FiltroPersona(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public ArrayList<Cliente> AplicarFiltro(ArrayList<Cliente> clientes) {
        ArrayList<Cliente> filtro =new ArrayList<>();
        for(Cliente cliente:clientes){
            if(cliente.getNombre().equals(nombre)){
                filtro.add(cliente);
            }
        }
        return filtro;
    }
}
