package banco;

public class CuentaBancaria {

    private long numero;
    private Cliente titular;
    private long saldo;

    public CuentaBancaria(Cliente titular, long saldo, long numero) {
        titular = new Cliente(titular);
        this.saldo = saldo;
        this.numero = numero;
    }

    public void retirar(long importe, CuentaBancaria cb){
        long saldo_nuevo;
        if(cb.getSaldo() <= importe){
            saldo_nuevo = cb.getSaldo() - importe;
            cb.setSaldo(saldo_nuevo);
        }
        else{
            System.out.println("No tiene suficiente dinero para retirar ese importe");
            System.out.println("Usted tiene tanto dinero: " + cb.getSaldo());
        }
        System.out.println("Su saldo actual despues de la retirada es de: " + cb.getSaldo());
    }

    public void ingresar(long importe, CuentaBancaria cb){
        long saldo_nuevo = cb.getSaldo() + importe;
        cb.setSaldo(saldo_nuevo);
        System.out.println("Has ingresado la suma de: " + importe);
        System.out.println("Usted tiene tanto dinero: "+ cb.getSaldo());
    }

    public void datosCuenta(CuentaBancaria cb){
        System.out.println("Numero de cuenta: " + cb.getNumero());
        System.out.println("Titular de la cuenta: " + cb.getTitular().getNombre());
        System.out.println("Saldo restante: " + cb.getSaldo());
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
