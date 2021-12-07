public class contaCorrente {
    private int agencia;
    private long numero;
    private int codCliente;
    private double saldo;

    public void setAgencia(int agencia){
        this.agencia=agencia;
    }
    public void setNumero(long numero){
        this.numero=numero;
    }
    public void setCodCliente(int codCliente){
        this.codCliente=codCliente;
    }
    public void setSaldo(Double saldo){
        this.saldo=saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }
    public long getNumero(){
        return this.numero;
    }
    public int getCodCliente(){
        return this.codCliente;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
