package ies.jms.Tarea2;
import java.io.File;

//Programa que diga cual es el directorio actual
public class Tarea2 {
    
    public static void main(String[] args) 
    {
        
        File entrada = new File("."+File.separator);

        System.out.println("Tu ubicacion es " + entrada.getAbsolutePath());
        
    }
    
}
