# Proyecto Java: Implementación de Algoritmos Clásicos

Este proyecto contiene la implementación de tres ejercicios algorítmicos desarrollados en Java. Cada ejercicio inicia con la formulación del algoritmo en lenguaje natural, seguida de su implementación en código.

## Ejercicio 1: Sistema de Gestión de Calificaciones

### Formulación del Algoritmo (Lenguaje Natural)

**Datos de entrada:**

* Número de estudiantes (N)
* Lista de N calificaciones (valores numéricos)

**Datos de salida:**

* Mediana
* Moda
* Desviación estándar

**Proceso a realizar:**

1. Solicitar al usuario el número de estudiantes.
2. Leer las N calificaciones.
3. Calcular la mediana:

   * Ordenar las calificaciones.
   * Si N es impar, tomar el valor central.
   * Si N es par, calcular el promedio de los dos valores centrales.
4. Calcular la moda:

   * Contar la frecuencia de cada calificación.
   * Determinar la calificación que más se repite.
5. Calcular la desviación estándar:

   * Calcular la media.
   * Restar la media a cada calificación y elevar al cuadrado.
   * Calcular el promedio de esas diferencias cuadradas y sacar la raíz cuadrada.

---

## Ejercicio 2: Números Primos con la Criba de Eratóstenes

### Formulación del Algoritmo (Lenguaje Natural)

**Datos de entrada:**

* Límite superior del rango (n)

**Datos de salida:**

* Lista de números primos hasta n

**Proceso a realizar:**

1. Solicitar al usuario el número límite n.
2. Crear una lista booleana desde 2 hasta n, inicializada en verdadero.
3. Para cada número p desde 2 hasta la raíz cuadrada de n:

   * Si p es verdadero:

     * Marcar como falso todos los múltiplos de p mayores que p.
4. Mostrar todos los índices que siguen marcados como verdaderos (son primos).

---

## Ejercicio 3: Ordenamiento por Inserción (con Principio de Invariante)

### Formulación del Algoritmo (Lenguaje Natural)

**Datos de entrada:**

* Lista de números desordenados

**Datos de salida:**

* Lista ordenada en orden ascendente

**Proceso a realizar:**

1. Recorrer la lista desde el segundo elemento hasta el final.
2. Tomar el valor actual y compararlo con los elementos a su izquierda.
3. Mover hacia la derecha los elementos mayores que él.
4. Insertar el valor actual en la posición correcta.
5. En cada paso, garantizar que la sublista a la izquierda esté ordenada (invariante del bucle).

---
