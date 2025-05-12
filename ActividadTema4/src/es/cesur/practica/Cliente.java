package es.cesur.practica;

/**
 * Clase que representa un cliente del banco.
 * Cada cliente tiene un DNI, un nombre y una dirección.
 * Proporciona métodos para obtener esta información.
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String direccion;

    /**
     * Constructor de la clase Cliente.
     * Inicializa los datos del cliente con su DNI, nombre y dirección.
     * 
     * @param dni El DNI del cliente.
     * @param nombre El nombre del cliente.
     * @param direccion La dirección del cliente.
     */
    public Cliente(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el DNI del cliente.
     * 
     * @return El DNI del cliente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la dirección del cliente.
     * 
     * @return La dirección del cliente.
     */
    public String getDireccion() {
        return direccion;
    }
}
