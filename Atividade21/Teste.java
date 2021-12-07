public class Teste {
    public static void main(String[] args) {
        Conta c=new Conta();
        ContaCorrente cc=new ContaCorrente();

        c.setCodCliente(346);
        c.setSaldo(1000.00);
        System.out.printf("Cod:%d \t Saldo:%.2f \n",c.getCodCliente(),c.getSaldo());
        c.transferencia(50.00);
        System.out.printf("Novo Saldo:%.2f \n",c.getSaldo());

        cc.setCodCliente(346);
        cc.setSaldo(1000.00);
        System.out.printf("Cod:%d \t Saldo:%.2f \n",cc.getCodCliente(),cc.getSaldo());
        cc.transferencia(10.00);
        cc.transferencia(10.00);
        cc.transferencia(10.00);
        cc.transferencia(10.00);
        cc.transferencia(10.00);
        System.out.printf("Novo Saldo com 5 tranferencias:%.2f \n",cc.getSaldo());
    }
}
