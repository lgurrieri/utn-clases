# Generics

La programación genérica es una técnica que consiste en escribir código que pueda ser reutilizado por objetos de diferente tipos. Por ejemplo, si estamos desarrollando un algoritmos para agrupar en una estructura de datos objetos de un mismo tipo (clase) no queremos desarrollar un programa que sirva solo para almacenar strings y otro que sirva solo para almacenar objetos del tipo File. Lo que queremos es que nuestro algoritmo pueda ser reutilizable para almacenar cualquier tipo de objeto.
Por tanto, en la programación genérica se trabaja con lo que denominamos parámatros de tipo.


Veamos un ejemplo:


```JAVA
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
            String pathFile = (String) files.get(i);
            System.out.println(pathFile);
        }
    }
}
```

En el ejemplo anterior definimos una colección (ArrayList) que nos permite almacenar objetos de cualquier tipo. Sin embargo, vamos a tener una problema con el segundo item, ya que en la línea:

```JAVA
 String pathFile = (String) files.get(i);
```
El casting espera que el tipo del eleeto sea String y no File por tanto esto nos va a dar acomo resultado una exceptión como la siguiente:


```BASH
Exception in thread "main" java.lang.ClassCastException: java.io.File cannot be cast to java.lang.String
        at app.App.main(App.java:26)
```


Apicando generics, podemos restringir el tipo que deben tener los elementos que se van a almacenar en la colección. Para esto, modificamos el programa anterior haciendo algunas modificaciones

```JAVA
public class AppGenerics {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        ArrayList<String> files = new ArrayList<String>();

        String file1 = "C:/Users/pepe/Documents/requirimientos.txt";
        String file2 = "C:/Users/pepe/Documents/clases.txt";
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
```

Algunos puntos a considerar:
* A la colección le añadimos la expresión **<**String**>** para indicar que solamante puede alamacenar solo elementos del tipo String. Esta notación se denomina **notación diamante**.
* Ya no necesitamos hacer un casting, ya que al indicar el tipo de los elementos que va a contener la colección es **String** , podemos obtener el valor de los mismos en forma directa.
* La restricción de tipo obliga a que usemos solo elmentos del tipo String y no objetos de otro tipo (**File**) como se muestra en el ejemplo anterior.



### Métodos Genéricos
Los métodos genéricos son aquellos cuya firma está escrita de manera única, pero pueden ser llamados con argumetos de distinto tipo (clase). El compilador se va a encargar de verificar que el tipo de los datos a utilizar sea el correcto. Los métodos genéricos tiene algunas particularidades:

* En térmimos generales la firma de un método es la misma que la de un método común.

* Los métodos genéricos tienen un parámetro de tipo (encerrado en el operador diamante **<>**) que se coloca antes del tipo devuelto por el método la declaración.

* Los parámetros de tipo pueden tener un criterio adicional de acotación que permite restringirconsiderar algún aspecto adicional sobre el tipo especificado como parámetro.

* En un método genérico puede tener más de un tipo, seperándolos por comas en la firma de método.



