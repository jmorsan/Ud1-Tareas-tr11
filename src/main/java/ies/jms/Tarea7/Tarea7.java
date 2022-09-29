package ies.jms.Tarea7;

import ies.jms.Tarea3.Tarea3;

import java.io.File;
import java.util.Scanner;

public class Tarea7 {



    public static void main(String[] args) {

        File entrada = new File("C:\\Users\\Nardocop\\Desktop\\EjemploTarea");

        Tarea3.listadoDirectorios(entrada);
    }



    public static void listadoDirectorios(File entrada)
    {
        Scanner sc = new Scanner(System.in);
        String borrar;

        if (!entrada.exists())
        {
            System.out.println(entrada.getName() + " no existe");

        }
        else if (entrada.isFile())
        {
            System.out.println(entrada.getName() + " -- Ficherito");
            System.out.println("Borrar el fichero?");
            borrar = sc.nextLine();
        }
        else if (entrada.isDirectory())
        {
            System.out.println("Borrar el fichero "+ entrada.getName() + " -- Carpetita");


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

    public static void borrarFile(File entrada){


    }
}
