\# Calculadora Java



Aplicación de consola desarrollada en Java y gestionada con Maven para practicar el control de versiones con Git y GitHub.



\## Requisitos



\- Java 21

\- Apache Maven (o un IDE compatible como NetBeans, IntelliJ IDEA o Eclipse)



\## Métodos disponibles (`Calculadora.java`)



\- `sumar(double a, double b)`: devuelve la suma de dos números.

\- `restar(double a, double b)`: resta el segundo número al primero.

\- `multiplicar(double a, double b)`: devuelve el producto de dos números.

\- `dividir(double a, double b)`: divide el primer número entre el segundo. Lanza una excepción (`IllegalArgumentException`) si el divisor es cero.

\- `potencia(double base, double exponente)`: calcula la potencia elevando la base al exponente indicado.

\- `modulo(double a, double b)`: calcula el resto de la división entre dos números. Lanza una excepción (`IllegalArgumentException`) si el divisor es cero.



\## Compilación y ejecución



Desde la raíz del proyecto en la terminal:



```bash

mvn clean compile

java -cp target/classes es.daw.calculadora.Main

```



\*(También se puede compilar y ejecutar directamente desde NetBeans usando la opción \*\*Clean and Build\*\* y ejecutando `Main.java`).\*



\## Ejemplo de ejecución



Con `numero1 = 20` y `numero2 = 5`, la salida por consola es:



```text

CALCULADORA JAVA

\----------------

Suma: 25.0

Resta: 15.0

Multiplicación: 100.0

División: 4.0

Potencia: 3200000.0

Módulo: 0.0

```

