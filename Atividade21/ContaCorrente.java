public class ContaCorrente extends Conta{
    private double taxaTransferencia =10.50;
    private double taxaManutencao=2.50;
    private int numTranferencias;

    @Override
    public void transferencia(double valor) {
        this.numTranferencias++;
        if(numTranferencias%5==0){
            setSaldo(getSaldo()-taxaManutencao);
        }
        super.transferencia(valor);
        setSaldo(getSaldo()-taxaTransferencia);
    }
}
