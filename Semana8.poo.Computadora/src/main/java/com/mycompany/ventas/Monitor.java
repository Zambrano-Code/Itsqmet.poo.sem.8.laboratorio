
package com.mycompany.ventas;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Monitor {
    
    //atributos
    private static int contID;
    private int idMonitor;
    private String marca;
    private double [] tamano = new double[2];
    
    /**
     * contructor vacio.
     */
    public Monitor(){
        
    }
    
    
    /**
     * contructor con los
     * @param marca
     * @param tamano 
     */
    public Monitor(String marca, double [] tamano){
        this.marca = marca;
        this.tamano = tamano;
    }
    
    //metodos publicos
    @Override
    public String toString(){
        return "ID: " + idMonitor + "   Marca: " + marca + "    Tamaño: " + tamano[0] + "x" + tamano[1];
    } 
    
    //metodos get y set

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double[] getTamano() {
        return tamano;
    }

    public void setTamano(double[] tamano) {
        this.tamano = tamano;
    }
    
}
