public class App {
    public static void main(String[] args) throws Exception {

        // Almacén para números enteros
        Almacen<Integer> almacenEnteros = new Almacen<>();
        almacenEnteros.agregar(1);
        almacenEnteros.agregar(2);
        almacenEnteros.agregar(3);

        System.out.println("Almacén de Enteros: " + almacenEnteros);

        // Almacén para cadenas de texto
        Almacen<String> almacenCadenas = new Almacen<>();
        almacenCadenas.agregar("Ecuador");
        almacenCadenas.agregar("Bolivia");
        almacenCadenas.agregar("Venezuela");


        System.out.println("Almacén de Cadenas: " + almacenCadenas);

        // Acceder a elementos individuales
        System.out.println("Cuarto elemento del almacén de enteros: " + almacenEnteros.obtener(3));
        System.out.println("Primer elemento del almacén de cadenas: " + almacenCadenas.obtener(0));
    }
}
