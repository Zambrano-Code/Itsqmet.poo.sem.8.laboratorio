
package com.mycompany.ventas;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Teclado extends DispositivoEntrada{
    
    //atributos
    private static int contId;
    private int idTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super( tipoEntrada,  marca);
        
        idTeclado = ++contId; 
    }
    
    //metodoso publicos
    @Override
    public String toString(){
        return "ID: " + idTeclado + "   " + super.toString();
    }

}
