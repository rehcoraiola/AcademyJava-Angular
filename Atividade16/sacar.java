public class sacar {
    private int numSaque=0;
    private double saldoConta=100000.00;
    private double taxaSaque=1.30;
    private conta conta;

    public sacar(conta c){
        conta=c;
    }
    private boolean verificaTaxa(double valor){
        if(numSaque+1%5==0)
            return true;
        return false;
    }
    private double calcTaxa(double valor){
        return valor+taxaSaque;
    }
    private boolean validaSaque(double valor){
        if(saldoConta<valor)   
            return false;
        return true;
    }
    private void atualizaSaldo(double valor){
        saldoConta-=valor;        
    }
    public boolean sacarr(double valor){
        if(verificaTaxa(valor))
            valor = calcTaxa(valor);
            
        if(validaSaque(valor)){
            atualizaSaldo(valor);
        }else{
            return false;
        }

        numSaque++;
        return true;
    }
    public double saldoConta(){
        return saldoConta;
    }

}
