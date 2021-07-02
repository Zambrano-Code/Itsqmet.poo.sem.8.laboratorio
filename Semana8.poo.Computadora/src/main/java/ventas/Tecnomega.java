package ventas;

import com.mycompany.ventas.Orden;
import java.io.IOException;
import metodosAyuda.Pedir;

/**
 * @author Created by: Geovanny Zambrano
 * 
 * Date: 20 jun. 2021;
 * 
 */
public class Tecnomega {

    private Orden nuevaOrden = new Orden();
    
    public Tecnomega() throws IOException{
        char opcion;
        do {
            opcion = menu();
            switch (opcion){
                case 'a' -> nuevaOrden.agregarComputador(Pedir.agregarComputadora());
                case 'b' -> Orden.verLista();
            }
            
        } while (opcion != 'c');
        
    }
    
    public static void main(String[] args) throws IOException {
        new Tecnomega();
    }
    
    private char menu() throws IOException{

        System.out.println("---------------- Menu Tienda -------------------");
        System.out.println("  a. Agregar Computadora");
        System.out.println("  b. Ver lista de computadora");
        System.out.println("  c. Salir");
        System.out.println("------------------------------------------------");
        return  Pedir.solicitarOpcion("abc");
    }
    
   
    
}
