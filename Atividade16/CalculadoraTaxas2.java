public class CalculadoraTaxas2 {
    private int numSaque=0;
    private double taxaTranf=0.001;
    private double saldoConta;
    private double taxaSaque=1.30;

    public void depositar(double valor){
        saldoConta=valor;
    }
    public double CalcTransferencia(double valor){
        double TrasfTaxa=(valor*taxaTranf)/100;
        return TrasfTaxa; 
    }
    
    private double calcTaxa(double valor){
        //numSaque++;
        if(numSaque%5==0)
            return valor+taxaSaque;
        return valor;
    }
    private boolean validaSaque(double valor){
        if(saldoConta<valor){
            //numSaque--;
            return false;
        }
        return true;
    }
    public void atualizaSaldo(double valor){
        saldoConta-=valor;  
        //return saldoConta;      
    }
    public void sacar(double valo){

    }
    public double saldo(){
        return saldoConta;
    }
    
}
