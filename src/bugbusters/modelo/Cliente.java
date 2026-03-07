package bugbusters.modelo;

public abstract class Cliente {
    private String email;
    private String nombre;
    private String domicilio;
    private String nif;
/*
Deberíamos añadir como atributo gastos de envío, quien crea al cliente en la app le asigna un coste de envío.
Esto permite que en Estandar ya tienen un costa asignado y en PRemium podemos hacer el cálculo automático en base
al descuento.
 */
    private double gastosEnvio;
    public Cliente (String email, String nombre, String domicilio, String nif, double gastosEnvio){
        this.email = email;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.gastosEnvio = gastosEnvio;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }
    //Creamos un método polimórfico para dividir comportamientos entre clases hijas.
    public abstract double calcularGastosEnvio();

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }
}
