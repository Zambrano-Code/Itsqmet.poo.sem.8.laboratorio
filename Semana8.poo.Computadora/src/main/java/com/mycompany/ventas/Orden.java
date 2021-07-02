
package com.mycompany.ventas;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Orden {
    //atributos
    private static int conID;
    private static Computadora[] computadoras = new Computadora[10];
    private int idOrden = 0;
    private int contadorOrdenes;
    private int contadorComputadoras;
    private int maxComputadoras;
    
    /**
     *Constructor vacio 
     */
    public Orden(){
        
    }
    
    //metodos publicos
    public void agregarComputador(Computadora computadora){
        if (computadoras.length >= 10) {            
            computadoras[idOrden] = computadora;

            idOrden = ++conID;
        }else{
            System.out.println("Lista llena, no puedes agregar mas elementos.");
        }
    }
    
    public static void verLista(){
        for(Computadora a: computadoras){
            System.out.println(a);
        }
    }
    
    public void calcularTotal(){
        
    }
    
    public void descuentoOrden(){
        
    }
    
    public void mostrarOrden(){
        
    }
    
    
    
    // metodos privado
    
    
}
