
package com.mycompany.ventas;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Computadora {
    //atributos
    private static int contID;
    private int id;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    
    /**
     * Constructor vacio
     */
    public Computadora(){
        
    }

    /**
     * Contructor con los.
     * @param nombre
     * @param monitor
     * @param teclado
     * @param raton 
     */
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        
        id = ++contID;
        
    }
    
    //Metodos publicos
    @Override
    public String toString(){
        return "\tNombre: " + nombre + "\n" + "\t\tMonitor -> " + monitor + "\n\t\tTeclado -> " + teclado + "\n\t\tRaton -> " + raton;
    }
    
    
    //metodos set y get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    
}
