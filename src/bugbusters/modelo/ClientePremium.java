package bugbusters.modelo;

public class ClientePremium extends Cliente {
/*
Estamos determinando que la lógica de negocio es que no habrá descuentos y cuotas individuales entre clientes premium
(por eso el uso de static), tampoco se va a permitir el canvio de las cifras a través de la aplicación, para evitar
posibles errores de modificación masiva (por eso el uso de final). Si en algún momento se quiere cambiar la cantidad,
debermos editar el valor de aquí.
 */
    private static final double CUOTA = 30.0;
    private static final double DESCUENTO = 0.20;
    public ClientePremium (String email, String nombre, String domicilio, String nif) {
        super(email, nombre, domicilio, nif);
    }
    public double getCuota() {
        return CUOTA;
    }
    public double getDescuento() {
        return DESCUENTO;
    }

    @Override
    public String toString() {
        return "ClientePremium{"+
                "Email='" + getEmail() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", Domicilio=" + getDomicilio() +
                ", NIF=" + getNif() +
                ", Cuota=" + getCuota() +
                ", Descuento=" + getDescuento() +
                '}';
    }

}
