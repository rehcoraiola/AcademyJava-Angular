public class TesteExtra extends Conta{
        private double taxaTransferencia =10.50;
        private double taxaManutencao=2.50;
        private int numTranferencias;
    
        @Override
        public void transferencia(double valor) {
            atualizaNumTranferencias();
            verificaTaxaManutencao();          
            super.transferencia(valor);
            setSaldo(getSaldo()-taxaTransferencia);
        }
        private void atualizaNumTranferencias(){
            this.numTranferencias++;
        }
        private void verificaTaxaManutencao(){
            if(numTranferencias%5==0){
                setSaldo(getSaldo()-taxaManutencao);
            }
        }
    
}
