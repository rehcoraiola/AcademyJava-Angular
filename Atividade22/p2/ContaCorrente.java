package p2;

public class ContaCorrente {
    private double saldo;
    private double taxaSaque=2.0;
    private int codCliente;

    public ContaCorrente(double saldo,int codCliente){
        this.saldo=saldo;
        this.codCliente=codCliente;
    }
    public void saque(double valor){
        this.saldo-=(valor+taxaSaque);
    }
    public void deposita(double valor){
        this.saldo+=valor;
    }

    @Override
    public String toString() {
        String msg="Saldo: "+this.saldo+"\nCodigo do cliente: "+this.codCliente;
        return msg;
    }
}
