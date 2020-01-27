# Colecciones

Al momento de implementar un método, elegir una colección adecuada nos facilita lograr un resultado óptimo en términos de performance.

Existen varios factores a considerar como, por ejemplo, la posibilidad de efectuar una búsqueda en forma rápida entre miles de items, añadir ó remover varios items en forma rápida en medio de alguna secuencia ordenada o poder establecer asociaciones entre claves y valores.

El framework de colecciones de JAVA dispone de una amplia implementación de algoritmos de estrucura de datos.

## JAVA Collections Framework

El framework de colecciones de JAVA ( o JAVA Collections Framework) en sus inicio (hasta la versión 1.2) disponía de un conjunto pequeño de clases para las estructuras de datos más útiles: **Vector**, **Stack**, **Hashtable**, **BitSet** y la interfaz **Enumeration**.

Uno de los principios de diseño del framework de colecciones de JAVA es que separa interfaces e implementaciones.

Por ejemplo, tenemos la interfaz **List** y una clase que implmenta dicha interfaz es **ArrayList**

La interfaz fundamental para las clases del framework de  colecciones es la interfaz Collection. Uno de los metdodos que dispone esta interfaz permite obtener un objeto que implmenta la interfaz Iterador.

```JAVA
public interface Collection<E>
{
    ...
    Iterator<E> iterator();
    ...
}
```

A través de un iterador, es posible visitar los elementos en una colección uno por uno.

La interfaz Iterator tiene cuentro métodos:


```JAVA
public interface Iterator<E>
{
    E next();
    boolean hasNext();
    void remove();
    default void forEachRemaining(Consumer<? super E> action);
}
```
Al llamar en forma repetida al método **next**, se pueden recorrer los elementos de la colección uno por uno. Sin embargo, si estamos en el último elemento de la colección y llamamos a next se generará una excepción del tipo **NoSuchElementException**. Por tanto, necesitamos llamar antes al método **hasNext** que devuelve **true** si el iterador tiene más elementos a continuación. Si queremos inspeccionar los elmentos de una colección, obtenemos una referencia del iterador y cotinuamos llamando al método **next** mientras el método **hasNext** retorne **true**.

```JAVA
Collection<String> collection = ...;

Iterator<String> iterator = collection.iterator();
while(iterator.hasNext()){
    String element = iterator.next();
    //hacemos algo con el elemento
}
```

Existe una alternativa para escribir el método anterior de manera más resumida usando un bucle *"for each"*:

```JAVA
for (String element : collection){
    //hacemos algo con el elemento
}
```

El compilador se encarga de traducir el bucle *"for each"* en un bucle con un iterador.

El bucle *"for each"* funciona con cualquier objeto que implementa la interfaz **Iterable** que especifica solo un método:

```JAVA
public interface Iterable<E>
{
    Iterator<E> iterator();
}
```
Debido a que la interfaz **Collection** hereda de **Iterable**, es posible usar el bucle *"for each"* con cualquier colección de la librería estándar de JAVA.

El orden en el cual los eleentos son recorridos va a depender del tipo de colección. Si iteramos sobre un **ArrayList**, el iterador inicia en el índice 0 y va incrementado el valor del índice en cada paso. Sin embargo si recorremos los elementos de un **HashSet**, vamos a obtener los elementos en forma aleatoria y, aunque vamos a poder acceder a todos los elementos de la colección durante el curso de la iteración, no vamos a poder establecer el orden de acceso a los elementos.
El método **remove** de la inerfaz **Iterator** remueve el elemento que fue devuelto por la última llamada al método **next**.


## Interfaces

El framework de colecciones de JAVA define un número de interfaces para diferentes tipos de colecciones, como se muestra en la siguiente figura:

![Jerarquía de interfaces de colecciones](https://github.com/lgurrieri/utn-clases/blob/master/SEMANA-DIC-04-06/collections/collections/images/collection-interfaces.png)

Hay dos interfaces fundamentales para las colecciones: **Collection** y **Map**.

Como ya hemos visto podemos añadir elementos a una colección (*Collection*) con el método add:

```JAVA
boolean add(E element)
```

Pero, para el caso de los mapas (*Map*) albergan pares de clave (*key*) y valor (*value*) y utilizamos el método **put** para insertarlos:

```JAVA
V put (K key, V value)
```

Cada uno de los elementos de una colección se acceden a través de un iterator. Para un mapa, en cambio, se pueden acceder a los valores con el método **get**:

```JAVA
V get(K key)
```

Una colección del tipo **List** es una colección ordenada. Los elementos son añadidos en una posición particular del contenedor. Un elemento se puede acceder de dos formas:

* **Por medio de un iterador**: Se recorre cada elemento de la colección en formasecuencial.
* **Por medio de un índice**: Se accede a los elmentos en un orden aleatorio, definido por el valor del índice especificado.

La interfaz **List** define varios métodos que permiten el acceso aleatorio a los elementos de la collección:

```JAVA
void add(int index, E elment)
void remove (int index)
E get(int index)
E set(int index, E element)
```

La interfaz ListIterator es una subinterfaz de Iterator y define un método para añadir n elemento antes de la posición actual del iterador:

```JAVA
void add(E element)
```

La interfaz **Set** es idéntica a la interfaz **Collecction** pero el comportamiento de los métodos está levemente definido. Le método **add** de un *set* debería recahazar valores duplicados. El método **equeals** de un *set* ddebería definir que dos *sets* idénticos si tienen los mismos elementos, auque no estén en el mismo orden. El método **hashCode** debería estar definido de manera que dos sets con contengan los mismos elementos generen el mismo hashCode.

Ahora bien ¿por qué hacer una interfaz aparte si las firmas de los métodos son iguales?
Conceptualmente, no todas las colecciones con sets. Hacer que una interfaz del tipo Set hace posible que los progrmadores escriban métodos que acepten solo sets.

## Colecciones concretas o clases de colección

La imagen a continuación muestra las colecciones de la librería de JAVA. No se han considerado las colecciones para el trabajo seguro con hilos.

![Jerarquía de clases de colecciones](https://github.com/lgurrieri/utn-clases/blob/master/SEMANA-DIC-04-06/collections/collections/images/collection-classes.png)

Todas las clases implementan las interfaz Collection, exceptuando a las clases con los nombres que terminan con el sufijo Map. Esas clases, por el contrario, implementan la interfaz **Map**.
