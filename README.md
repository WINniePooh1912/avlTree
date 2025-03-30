# AVL Tree en Java

Este proyecto implementa un Árbol AVL en Java. Un Árbol AVL es una estructura de datos autoequilibrada que mantiene el equilibrio mediante rotaciones después de cada inserción para garantizar una complejidad de búsqueda logarítmica.

## Estructura del Proyecto

El proyecto contiene los siguientes archivos principales:

- `Tree.java`: Implementación de la estructura del Árbol AVL con métodos para inserción equilibrada, rotaciones y recorridos.
- `Main.java`: Clase principal que prueba la funcionalidad del árbol AVL y muestra ejemplos de árboles balanceados y no balanceados.

## Funcionalidades

### `Tree.java`

- **Inserción Simple (`add`)**: Agrega un nodo sin reequilibrar el árbol.
- **Inserción con Balanceo (`addBalance`)**: Inserta un nodo y ajusta la estructura del árbol mediante rotaciones.
- **Rotaciones**:
  - Rotación Simple a la Derecha (`rightRotation`)
  - Rotación Simple a la Izquierda (`leftRotation`)
  - Rotación Doble Izquierda-Derecha
  - Rotación Doble Derecha-Izquierda
- **Recorridos del Árbol**:
  - Preorden (`preorderLeft`, `preorderRight`)
  - Inorden (`inorderLeft`, `inorderRight`)
  - Postorden (`postorderLeft`, `postorderRight`)
- **Visualización del Árbol (`traverse`)**: Muestra los niveles del árbol de manera jerárquica.

### `Main.java`

- Crea un árbol no balanceado y un árbol autoequilibrado utilizando el método `addBalance`.
- Demuestra los diferentes recorridos de los árboles generados.
- Muestra la estructura del árbol antes y después del balanceo.

## Ejecución

Para ejecutar el programa, compila los archivos Java y ejecuta `Main`:

```sh
javac Tree.java Main.java
java Main
```

## Salida Esperada

El programa imprimirá la estructura del árbol antes y después del balanceo, junto con sus diferentes recorridos.

## Licencia

Este proyecto está bajo la licencia MIT. Puedes usarlo y modificarlo libremente.

