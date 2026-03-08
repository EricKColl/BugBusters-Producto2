package bugbusters.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase base para la gestión de colecciones de datos.
 */
public class GenericoDAO<K, T> {

    /**
     *    Usamos protected para que las clases hijas (como ClienteDAO)
     *     puedan acceder directamente a 'datos' si necesitan hacer filtros.
    */
    protected Map<K, T> datos;

    public GenericoDAO() {
        this.datos = new HashMap<>();
    }

    public void añadir(K llave, T objeto) {
        datos.put(llave, objeto);
    }

    public T buscar(K llave) {
        return datos.get(llave);
    }

    public boolean existe(K llave) {
        return datos.containsKey(llave);
    }

    public ArrayList<T> obtenerTodos() {
        return new ArrayList<>(datos.values());
    }

    public void eliminar(K llave) {
        datos.remove(llave);
    }
}
