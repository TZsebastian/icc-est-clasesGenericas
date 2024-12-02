import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    private List<T> items;

    public Almacen() {
        this.items = new ArrayList<>();
    }

    public void agregar(T item) {
        items.add(item);
    }

    public String obtener(int index) {
        if (index < 0 || index >= items.size()) {
            return "No se encuentra ese elemento en el almacen";
        }
        return items.get(index).toString();
    }

    public List<T> obtenerTodos() {
        return items;
    }

    @Override
    public String toString() {
        return "Almacen{items=" + items + '}';
    }
}
