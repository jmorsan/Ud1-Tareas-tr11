package ies.jms.Tarea3;

import java.io.File;

//Hacer un programa que liste el contenido del directivo actual de forma recursiva.

public class Tarea3 {
    public static void main(String[] args) {
        
        File entrada = new File("./");

        Tarea3.listadoDirectorios(entrada);
    }

    

    public static void listadoDirectorios(File entrada)
    {
        if (!entrada.exists())
        {
            System.out.println(entrada.getName() + " no existe");

        }
        else if (entrada.isFile())
        {
            System.out.println("  "+entrada.getName() + " -- Ficherito");
            
        }
        else if (entrada.isDirectory())
        {
            System.out.println(entrada.getName() + " -- Carpetita");

            File[] files = entrada.listFiles();

            if(files.length > 0)
            {
                for (File f : files)
                {
                    listadoDirectorios(f);
                }
            }
        }
    }
}
