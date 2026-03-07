package bugbusters.modelo;
/*
Propongo crear un archivo DAO (Data Access Object), esto ayuda a diversificar y tener controlado como se almacena cada clase
de nuestra aplicación. Además hace el código más legible, permitiendo saber a que archivo ir a editar si hay algun fallo
en la lógica de persistencia. Tambien permite que todos podamos estar tocando la lógica de persistencia sin miedo a estar
editando el código de otro compañero (es cierto que suele usarse en aplicaciones más grandes).
 */

import java.util.ArrayList;

public class ClienteDAO extends GenericoDAO<String, Cliente> {
    public ClienteDAO() {
        super();
    }



    /**
     * Filtra y devuelve solo los clientes de tipo Estándar (Punto 2.3 del menú)
     */
    public ArrayList<Cliente> obtenerEstándar() {
        ArrayList<Cliente> listaEstandar = new ArrayList<>();
        // 'datos' es accesible porque en GenericoDAO es 'protected'
        for (Cliente c : datos.values()) {
            if (c instanceof ClienteEstandar) {
                listaEstandar.add(c);
            }
        }
        return listaEstandar;
    }

    /**
     * Filtra y devuelve solo los clientes de tipo Premium (Punto 2.4 del menú)
     */
    public ArrayList<Cliente> obtenerPremium() {
        ArrayList<Cliente> listaPremium = new ArrayList<>();
        for (Cliente c : datos.values()) {
            if (c instanceof ClientePremium) {
                listaPremium.add(c);
            }
        }
        return listaPremium;
    }
}