package es.cesur.practica;

/**
 * Clase que representa una cuenta bancaria.
 * Cada cuenta tiene un número de cuenta, un saldo y un cliente asociado.
 * Proporciona métodos para ingresar dinero, retirar dinero y consultar el saldo de la cuenta.
 */
public class Cuenta {

    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    /**
     * Constructor de la clase Cuenta.
     * Inicializa la cuenta con el número de cuenta, el saldo inicial y el cliente asociado.
     * 
     * @param numeroCuenta El número único de la cuenta.
     * @param saldoInicial El saldo inicial de la cuenta.
     * @param cliente El cliente que es propietario de esta cuenta.
     */
    public Cuenta(int numeroCuenta, double saldoInicial, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }

    /**
     * Obtiene el número de cuenta de esta cuenta bancaria.
     * 
     * @return El número de la cuenta.
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el cliente asociado a esta cuenta.
     * 
     * @return El cliente propietario de la cuenta.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * Si la cantidad es positiva, se añade al saldo de la cuenta.
     * 
     * @param cantidad La cantidad de dinero a ingresar.
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * Si la cantidad es positiva y no excede el saldo disponible, se deduce del saldo de la cuenta.
     * 
     * @param cantidad La cantidad de dinero a retirar.
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
}
