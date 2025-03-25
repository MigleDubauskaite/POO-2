# POO2 - PROGRAMACIÓN ORIENTADA A OBJETOS: PARTE 2

![imagen de POO](https://javaprogram101.wordpress.com/wp-content/uploads/2018/05/programacion-orientada-objetos.jpg?w=1200&h=800&crop=1)


## Introducción
Este repositorio está destinado a los estudiantes que continúan con el aprendizaje de Java en el contexto de la Programación Orientada a Objetos (POO). En esta fase se profundiza en conceptos más avanzados como **static**, **herencia**, **polimorfismo**, **clases genéricas**, **ArrayList**, **Collections**, **bucles anidados**, **arrays bidimensionales**, **enums**, y el uso de **lambdas** e **interfaces funcionales**.

En este proyecto, hemos implementado un menú de juegos interactivo y trabajado con un ejercicio práctico de Collections utilizando enum para gestionar un estacionamiento (Parking). Además, hemos aprendido a sobrescribir los métodos equals y hashCode, elementos clave en la gestión de objetos en Java.

Para el desarrollo de este proyecto, se ha utilizado el entorno de desarrollo Eclipse.

## Requisitos
Para ejecutar los ejemplos de este proyecto, es necesario tener instalado lo siguiente:

- Java 8 o superior.
- Eclipse IDE para el desarrollo de aplicaciones Java → [eclipse IDE](https://www.eclipse.org/downloads/)


## Temas Cubiertos

### - Concepto de static

En Java, el modificador static se utiliza para declarar miembros de una clase (como métodos y variables) que son compartidos por todas las instancias de la clase. Es decir, no dependen de una instancia de la clase, sino que pertenecen a la propia clase.

```java
public class EjemploStatic {
    static int contador = 0;
    public static void incrementarContador() {
        contador++;
    }
}
```

### - Herencia y Polimorfismo

Herencia es un principio fundamental de la POO que permite crear nuevas clases basadas en clases existentes. Polimorfismo es la capacidad de un objeto de tomar muchas formas. En Java, el polimorfismo se logra mediante la sobrescritura de métodos.

```java
class Animal {
    void sonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("El perro ladra");
    }
}
```

### - Clases Genéricas
Las clases genéricas permiten definir clases, interfaces y métodos con tipos de datos que se especifican de forma flexible. Esto se logra utilizando los operadores <T>.

```java
public class Caja<T> {
    private T contenido;

    public void ponerContenido(T contenido) {
        this.contenido = contenido;
    }

    public T obtenerContenido() {
        return contenido;
    }
}
```

### - Collection

En Java, Collection < E > es una interfaz genérica que forma parte del Java Collections Framework (JCF) y define operaciones básicas para manipular grupos de objetos, como agregar, eliminar y recorrer elementos.

Existen tres tipos principales de colecciones:

1. **List< E >** → Lista ordenada que permite duplicados.
    * **ArrayList< E >**
2. **Set< E >** → Conjunto sin duplicados.
    * **HashSet< E >** → Basado en tabla hash, sin orden específico.
    * **TreeSet< E >** → Ordena automáticamente los elementos.
3. **Map< K, V >** → Estructura clave-valor.
    * **HashMap<K, V>** → Basado en tabla hash, sin orden específico.
    * **TreeMap<K, V>** → Ordena automáticamente por clave.


| Tipo   | Permite duplicados | Mantiene orden |
|--------|--------------------|----------------|
| List   | ✅ Sí              |✅ Sí          |
| Set    | ❌ No              | ❌ No (HashSet), ✅ Sí (LinkedHashSet)  |    
| Map    | ❌ No (claves), ✅ Sí (valores)    |  ❌ No (HashMap), ✅ Sí (LinkedHashMap)         |


### - Bucles Anidados y Arrays Bidimensionales
Los bucles anidados permiten realizar iteraciones dentro de otras iteraciones. Esto es útil, por ejemplo, cuando se trabaja con arrays bidimensionales.

```java
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

### - Enums
Enums son un tipo especial de clase que representa un conjunto de constantes. Son útiles cuando necesitas representar un grupo fijo de valores.

```java 
enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

Dia hoy = Dia.LUNES;
``` 

### - Lambdas e Interfaces Funcionales
Lambdas permiten expresar funciones de forma compacta. Junto con las interfaces funcionales, podemos escribir código más limpio y funcional.

```java 
List<String> lista = Arrays.asList("Java", "Python", "C++");
lista.forEach(s -> System.out.println(s));
``` 

*** 
## Recursos Adicionales
* [w3schools - Herencia](https://www.w3schools.com/java/java_inheritance.asp)
* [w3schools - Poliformismo](https://www.w3schools.com/java/java_polymorphism.asp)

