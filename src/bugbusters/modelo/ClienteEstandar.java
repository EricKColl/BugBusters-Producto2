package bugbusters.modelo;

public class ClienteEstandar extends Cliente{
    public ClienteEstandar (String email, String nombre, String domicilio, String nif, double gastosEnvio){
        super(email, nombre, domicilio, nif, gastosEnvio);
    }
    public double calcularGastosEnvio() {
        // Para el cliente estándar, el gasto real es el que tiene el atributo
        return getGastosEnvio();
    }

    @Override
    public String toString() {
        return "ClienteEstandar{"+
                "Email='" + getEmail() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", Domicilio=" + getDomicilio() +
                ", NIF=" + getNif() +
                ", Gastos Envío=" + getGastosEnvio() +
                '}';
    }

}
