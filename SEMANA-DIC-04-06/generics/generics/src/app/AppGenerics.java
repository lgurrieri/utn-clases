package app;

import java.io.File;
import java.util.ArrayList;

/**
 * Ejemplo de un programa que no usa generics.
 *
 */
public class AppGenerics {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        ArrayList<String> files = new ArrayList<String>();

        String file1 = "C:/Users/pepe/Documents/requirimientos.txt";
        String file2 = "C:/Users/pepe/Documents/clases.txt";
        //File file2 = new File("C:/Users/pepe/Documents/clases.txt");
        String file3 = "C:/Users/pepe/Documents/notes.txt";

        files.add(file1);
        files.add(file2);
        files.add(file3);

        for (int i = 0; i < files.size(); i++) {
            String pathFile = files.get(i);
            System.out.println(pathFile);
        }
    }
}