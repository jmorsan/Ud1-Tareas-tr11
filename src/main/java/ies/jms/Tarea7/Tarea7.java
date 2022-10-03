package ies.jms.Tarea7;

import ies.jms.Tarea3.Tarea3;

import java.io.File;
import java.util.Scanner;

public class Tarea7
{
    public static void main(String[] args)
    {

        File entrada = new File("C:"+File.separator+"Users"+File.separator+"2DAM"+File.separator+"Desktop"+File.separator+"miCarpeta");

        Tarea7.listadoDirectorios(entrada);
    }
    public static void listadoDirectorios(File entrada)
    {

        if (!entrada.exists())
        {
            System.out.println(entrada.getName() + " no existe");

        }

        else if (entrada.isFile())
        {
            System.out.println(entrada.getName() + " -- Ficherito");
            borrarFile(entrada);

        }
        else if (entrada.isDirectory())
        {
            System.out.println(entrada.getName() + " -- Directorio");

            File[] files = entrada.listFiles();

            if(files.length > 0)
            {
                for (File f : files)
                {
                    listadoDirectorios(f);
                }
            }
            entrada.delete();
        }
    }

    public static void borrarFile(File entrada)
    {

        Scanner sc = new Scanner(System.in);
        String borrar;

        System.out.println("Borrar el Fichero/Directorio(s/n)?");
        borrar = sc.nextLine();

        if(borrar.charAt(0)=='s')
        {
            borrar = "";
            System.out.println("Seguro que quiere borrar el Fichero/Directorio (s/n)?");
            borrar = sc.nextLine();

            if(borrar.charAt(0)=='s')
            {
                entrada.delete();
                System.out.println("Fichero " + entrada.getName() + " ha sido destruido.");
            }
            else
            {
                System.out.println("Fichero NO borrado");
            }

        }
        else
        {
            System.out.println("Fichero NO borrado");
        }



    }
}
