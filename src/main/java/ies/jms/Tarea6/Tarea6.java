package ies.jms.Tarea6;

import java.io.File;


public class Tarea6 {
    public static void main(String[] args) {
        try{
            File miCarpeta = new File("C:" + File.separator+"Users" + File.separator+"2DAM" + File.separator+"Desktop" + File.separator+"Carpeta prueba");

            File[] misElementos = miCarpeta.listFiles(new Filtro());

            for (File entrada : misElementos)
            {
                System.out.println(entrada.getName());

            }

        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());
            System.out.println("No se encontro ningun archivo de ese tipo");

        }catch (Exception e){

            System.out.println(e.getStackTrace());

        }

    }
}
