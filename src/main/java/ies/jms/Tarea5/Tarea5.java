package ies.jms.Tarea5;

import java.io.File;

public class Tarea5 {
    public static void main(String[] args) {

        File directorio1 = new File("." + File.separator + "dir1");
        File directorio2 = new File("." + File.separator + "dir2");
        File fichero1 = new File(directorio1, "f11.doc");
        File fichero2 = new File(directorio2, "f21.txt");

        System.out.println(fichero1.renameTo(new File(directorio1,"f12.doc")));
        System.out.println(fichero2.renameTo(new File(directorio1,"f21.txt")));

        System.out.println(directorio2.delete());



    }
}
