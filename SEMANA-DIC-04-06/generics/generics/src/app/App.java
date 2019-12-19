package app;

import java.io.File;
import java.util.ArrayList;

/**
 * Ejemplo de un programa que no usa generics.
 * Al ejecutar el programa se produce una excepción del tipo ClassCastException.
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        ArrayList files = new ArrayList();

        String file1 = "C:/Users/pepe/Documents/requirimientos.txt";
        File file2 = new File("C:/Users/pepe/Documents/clases.txt");
        String file3 = "C:/Users/pepe/Documents/notes.txt";

        files.add(file1);
        files.add(file2);
        files.add(file3);

        for (int i = 0; i < files.size(); i++) {
            Object o = files.get(i);
            if(o instanceof String){
            String pathFile = (String) o;
            System.out.println(pathFile);
            }else{
                File file = (File) o;
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}