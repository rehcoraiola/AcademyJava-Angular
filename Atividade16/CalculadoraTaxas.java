//import jdk.javadoc.internal.doclets.toolkit.resources.doclets;

public class CalculadoraTaxas{
    private int numSaque=0;
    private double taxaTranf=0.001;

    public double CalcTransferencia(double valor){
        double TrasfTaxa=(valor*taxaTranf)/100;
        return TrasfTaxa; 
    }
    public double CalcSaque(double valor){
        numSaque++;
        if(numSaque%5==0){
            return valor+1.30;
        }
        return valor;
    }
    

}