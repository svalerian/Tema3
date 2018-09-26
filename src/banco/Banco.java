package banco;
/*@author
    Sergio Valerian
 */
public class Banco {
    public static void main(String[] args){
        Cliente c1 = new Cliente("Graciela Alvarez", "5738591-J", 284930138);
        c1.mostrarDatos();
        System.out.println();
        c1.actulizarCliente(c1, "Pepa Moreno", "12345678-K", 123456789);
        c1.mostrarDatos();
        System.out.println();

        Cliente c2 = new Cliente("Valentin Rojas", "27493027-M", 639103748);
        c2.mostrarDatos();
        System.out.println();

        CuentaBancaria cb1 = new CuentaBancaria(c1, 0, 54);
        cb1.ingresar(400000000, cb1);
        cb1.datosCuenta(cb1);
        cb1.retirar(5000000, cb1);
        System.out.println();
        cb1.actualizarCuenta(cb1, 65,  c2, 5000);
        cb1.datosCuenta(cb1);
        System.out.println();

    }
}
