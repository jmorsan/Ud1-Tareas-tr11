package ies.jms.Tarea1;

import java.io.File;

//Programa que muestre todas las entradas del directorio "c:\\windows"
public class Tarea1 
{

    public static void main(String[] args) 
    {
        
        File entrada = new File("C:" + File.separator +"windows");

        for (File listado : entrada.listFiles()) 
        {
            System.out.println(listado.getName());
            
        }
    }

    
    
}
