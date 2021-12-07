
public class Conta {
    private double saldo;
    private int codCliente;

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getCodCliente() {
        return codCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void transferencia(double valor){
        this.saldo -=valor;
    }
}
