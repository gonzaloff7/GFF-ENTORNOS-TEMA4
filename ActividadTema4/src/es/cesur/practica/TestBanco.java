package es.cesur.practica;

/**
 * Clase principal que simula operaciones entre cuentas bancarias.
 */
public class TestBanco {

    public static void main(String[] args) {

        // Antonio y Beatriz se hacen clientes del banco
        Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
        Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

        // Por defecto, todas las cuentas nuevas tienen 100€
        Cuenta cuentaDeAntonio = new Cuenta(48151, 100, antonio);
        Cuenta cuentaDeBeatriz = new Cuenta(62342, 100, beatriz);

        // Consultar saldos iniciales
        mostrarSaldo(cuentaDeAntonio);
        mostrarSaldo(cuentaDeBeatriz);

        // Beatriz transfiere 50€ a Antonio
        cuentaDeBeatriz.retirar(50);
        cuentaDeAntonio.ingresar(50);

        // Consultar saldos después de la transferencia
        mostrarSaldo(cuentaDeAntonio);
        mostrarSaldo(cuentaDeBeatriz);

        // Antonio gana 100€ en una rifa
        cuentaDeAntonio.ingresar(100);

        // Beatriz paga 30€ a Hacienda
        cuentaDeBeatriz.retirar(30);

        // Consultar saldos tras movimientos
        mostrarSaldo(cuentaDeAntonio);
        mostrarSaldo(cuentaDeBeatriz);

        // Antonio devuelve los 50€ a Beatriz
        cuentaDeAntonio.retirar(50);
        cuentaDeBeatriz.ingresar(50);

        // Consultar saldos finales
        mostrarSaldo(cuentaDeAntonio);
        mostrarSaldo(cuentaDeBeatriz);
    }

    /**
     * Muestra el saldo de una cuenta por consola.
     *
     * @param cuenta La cuenta cuyo saldo se quiere mostrar
     */
    public static void mostrarSaldo(Cuenta cuenta) {
        System.out.println("La cuenta de " + cuenta.getCliente().getNombre()
                + " tiene " + cuenta.getSaldo() + " euros");
    }
}

