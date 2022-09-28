package ies.jms.Tarea6;

import java.io.File;
import java.io.FileFilter;

public class Filtro implements FileFilter {

    public boolean accept(File path)
    {
        int lastDot = path.getName().lastIndexOf(".");
        return path.getName().substring(lastDot + 1).equals("doc");
    }
}
