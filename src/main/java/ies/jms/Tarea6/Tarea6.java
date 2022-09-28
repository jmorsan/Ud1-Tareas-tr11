package ies.jms.Tarea6;

import java.io.File;
import java.util.Arrays;

public class Tarea6 {
    public static void main(String[] args) {

        File miCarpeta = new File("C:" + File.separator+"Users" + File.separator+"2DAM" + File.separator+"Desktop" + File.separator+"Carpeta prueba");

        File[] misElementos = miCarpeta.listFiles(new Filtro());


    }
}
