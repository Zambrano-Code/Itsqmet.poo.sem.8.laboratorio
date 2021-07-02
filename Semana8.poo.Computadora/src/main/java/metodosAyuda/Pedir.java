
package metodosAyuda;

import com.mycompany.ventas.Computadora;
import com.mycompany.ventas.Monitor;
import com.mycompany.ventas.Raton;
import com.mycompany.ventas.Teclado;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Geovanny Zambrano
 */

public class Pedir {
    
    /**
     * Pide un texto por consola obligatorio
     * @return String
     * @throws IOException 
     */
    public static String pedirText() throws IOException{
        BufferedReader conTecl = new BufferedReader(new InputStreamReader(System.in));
        boolean repetir = true;
        String txt = null;
        do {
            txt = conTecl.readLine();
            
            if (txt.equalsIgnoreCase("") || txt.equalsIgnoreCase(null)) {
                System.out.println("No a ingresado ningun Dato. Intente de nuevo: ");
            }else{
                repetir = false;
            }
            
        } while (repetir);
        
        return txt;
        
    }
   
    
    /**
     * 
     * solicita una opcion en de los valores que se los indique en el parametro
     * @param opciones'
     * @return
     * @throws IOException 
     */
    public static char solicitarOpcion(String opciones) throws IOException{
        
        String text = "";
        
        boolean repetir = true;
            
        do {        
            text = pedirText();

            for (int i = 0; i < opciones.length(); i++) {
                if (text.charAt(0) == opciones.charAt(i)) {
                    repetir = false;
                }
                
            }
            
            if (repetir) {
                System.out.println("La opcion ingresada no hay en la lista. Intenta de nuevo.");

            }
            
        } while (repetir);
        
        return text.charAt(0);
        
    }
    
    /**
     * Pide un numero Double
     * @return
     * @throws IOException 
     */
    public static double numeroDouble() throws IOException{
        double num = 0;
        boolean repetir = false;
        do {
            try{
                num = Double.parseDouble(pedirText());
            }catch (NumberFormatException e){
                System.out.println("El valor ingresado no es un numero.\nIntenta de nuevo.");
                repetir = true;
            }
        } while (repetir);
        
        return num;
        
    }
    
    /** 
     * Pide un numero Entero
     * @return
     * @throws IOException 
     */
    public static int numeroInt() throws IOException{        
        
        return (int)numeroDouble();
        
    }
    
    
    //----------------------------------------------------------
    public static Computadora agregarComputadora() throws IOException{
        return new Computadora(pedirNombre(), pedirMonitor(), pedirTeclado(), pedirMouse());
    }
    
    /**
     * Pide valores de parametros
     * @return
     * @throws IOException 
     */
    private static String pedirNombre() throws IOException{
        System.out.println("Ingresa el nombre del equipo:");
        return pedirText();
    }
    
    private static String pedirMarca() throws IOException{
        System.out.println("Ingresa la marca: ");
        return pedirText();
    }
    
    private static double [] pedirTamano() throws IOException {
        double a,b;
        System.out.println("Ingresa la dimencion.");
        System.out.println("x: ");
        a = numeroDouble();
        System.out.println("y: ");
        b = numeroDouble();
        
        return new double [] {a, b};
    }
    
    private static String pedirTipoEntrada() throws IOException{
        System.out.println("Ingresa el tipo de entrada del dispositivo");
        return pedirText();
    }
    
    //Pedir clasesssssssswsssssssss
    
    private static Monitor pedirMonitor() throws IOException{
        System.out.println("Ingresa la caracteristicas del Monitor");
        return new Monitor(pedirMarca(), pedirTamano());
    }
    
    private static Raton pedirMouse() throws IOException{
        System.out.println("Ingresa la caracteristicas del Mouse");
        return new Raton (pedirTipoEntrada(), pedirMarca());
    }
    
    private static Teclado pedirTeclado() throws IOException{
        System.out.println("Ingresa la caracteristicas del Teclado");
        return new Teclado (pedirTipoEntrada(), pedirMarca());
    }
    //-----------------------------------
    

    
    //Confirmaciones
    public static boolean pedirConfirmacion() throws IOException{
        
        boolean repetir = true;
        char conf;
        
        do {            
            System.out.println("Ingresa para confirmar (s/n)");
            conf = pedirText().charAt(0);
            if (conf == 's' || conf == 'n') {
                repetir = false;
            }else {
                System.out.println("Opcion incorrecta, intenta de nuevo (s/n)");
            }
        
        } while (repetir);
        return switch (conf) {
                case 's' -> true;
                default -> false;
            };
    }
    
    
}