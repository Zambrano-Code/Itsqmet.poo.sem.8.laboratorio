package com.mycompany.ventas;


/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Raton extends DispositivoEntrada {
    //atributos
    private static int idCont = 0;
    private int idMouse;

    public Raton(String tipoEntrada, String marcal) {
        super(tipoEntrada, marcal);
        
        idMouse = ++idCont;
    }
    
    //metodos publicos
    @Override
    public String toString(){
        return "ID: " + idMouse + "   " + super.toString();
    }
    
    
    //metodos get y set

    
}
