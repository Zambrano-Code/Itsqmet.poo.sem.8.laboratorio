
package com.mycompany.ventas;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class DispositivoEntrada {
    
    //atributos
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    
    @Override
    public String toString(){
        return "Marca: " + marca + "   TipoEntrada: " + tipoEntrada;
    }
    
    //metodos get y set

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
