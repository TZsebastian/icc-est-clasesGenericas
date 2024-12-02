## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

# Proyecto AlmacenGenérico

Este proyecto muestra cómo implementar una clase genérica simple llamada `Almacen`, que puede almacenar elementos de cualquier tipo.

### Clase `Almacen<T>`
La clase genérica `Almacen` utiliza un parámetro de tipo `<T>` para representar el tipo de los elementos que almacenará. Este tipo se especifica cuando se crea una instancia de la clase.

## ¿Qué son los datos genéricos?

Los **datos genéricos** son valores o elementos cuyo tipo no está definido de manera fija en el código, sino que se especifica en el momento en que se utiliza. Esto permite que una estructura o algoritmo pueda trabajar con diferentes tipos de datos, manteniendo la seguridad de tipos y evitando errores en tiempo de compilación.

**Ejemplo de datos genéricos en Java**:

List<String> lista = new ArrayList<>();
lista.add("Hola");

## Interpretación

Los datos genéricos proporcionan una gran flexibilidad al permitir que un mismo código maneje diferentes tipos de datos. Al igual que las clases genéricas, los datos genéricos favorecen la reutilización del código, eliminan redundancias y aseguran que los tipos se gestionen de forma segura y eficiente. Esto hace que el código sea más adaptable, mantenible y menos propenso a errores.


## ¿Qué son las clases genéricas?

Una clase genérica en programación, especialmente en lenguajes como Java, es una clase que permite trabajar con diferentes tipos de datos sin necesidad de especificar de antemano qué tipo exacto de datos utilizará. En lugar de definir tipos concretos como int, String, Double, o Object, se define un parámetro de tipo genérico. Este parámetro se utiliza dentro de la clase como un marcador que representa cualquier tipo de dato. Los tipos específicos se determinan solo cuando la clase se instancia, permitiendo que la misma clase pueda operar con diferentes tipos de datos sin tener que reescribir el código.

## ¿Cómo funciona una clase genérica?

Cuando se define una clase genérica, se introduce un parámetro de tipo entre los corchetes angulares (< >). Este parámetro se usa como un marcador para cualquier tipo de dato que se desee utilizar. En otras palabras, la clase se diseña para ser independiente del tipo de datos con el que se va a trabajar, y el tipo específico se le pasa cuando se crea una instancia de la clase.

## Interpretación 

Las clases genéricas permiten una gran reutilización de código al eliminar la necesidad de escribir múltiples versiones de una clase para manejar diferentes tipos de datos. En lugar de crear clases separadas para cada tipo, se puede desarrollar una única clase que sea capaz de trabajar con cualquier tipo de dato. Esto reduce la redundancia y facilita el mantenimiento del código.