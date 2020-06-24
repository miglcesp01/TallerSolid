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
public abstract class FiltroEspecificaciones {
    public ArrayList<Cliente> Filtrar(ArrayList<Cliente> clientes){
        return AplicarFiltro(clientes);
    }
    public abstract ArrayList<Cliente> AplicarFiltro(ArrayList<Cliente> clientes);
}
