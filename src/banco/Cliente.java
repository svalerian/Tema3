package banco;

public class Cliente {

    private String nombre;
    private long dni;
    private long telefono;

    public Cliente(String nombre, long dni, long telefono){
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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
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
        System.out.print(nombre);
        System.out.print(dni);
        System.out.print(telefono);
    }
}
