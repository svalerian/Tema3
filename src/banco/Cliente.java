package banco;

public class Cliente {

    private String nombre;
    private String dni;
    private long telefono;

    public Cliente(String nombre, String dni, long telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public Cliente(Cliente c){
        nombre = c.getNombre();
        dni = c.getDni();
        telefono = c.getTelefono();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    //Mostrar datos

    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(dni);
        System.out.println(telefono);
    }

    //Metodo extra
    public void actulizarCliente(Cliente cliente, String nombre, String dni, long telefono){
        cliente.setNombre(nombre);
        cliente.setDni(dni);
        cliente.setTelefono(telefono);
    }
}
