package ies.jms.Tarea4;

import java.io.File;
import java.io.IOException;

public class Tarea4
{
    public static void main( String[] args ) {
        File directorio1 = new File("." + File.separator + "dir1");
        File directorio2 = new File("." + File.separator + "dir2");
        File fichero1 = new File(directorio1, "f11.doc");
        File fichero2 = new File(directorio2, "f21.txt");

        //Creamos Carpeta
        System.out.println("Carpeta creada:");
        System.out.println(directorio1.mkdir());
        System.out.println(directorio2.mkdir());

        //Creamos fichero
        try {
            System.out.println("Fichero creado:");
            System.out.println(fichero1.createNewFile());
            System.out.println(fichero2.createNewFile());


        } catch (IOException e) {
            System.out.println(e.getStackTrace());

        }
    }


}
