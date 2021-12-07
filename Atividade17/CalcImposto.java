
public class CalcImposto {
    private double taxaISS=0.01;
    private double taxaIOF=0.02;
    private double taxaIR=0.15;

    public double calcISS(double valor){
        double imposto=valor*taxaISS;
        return imposto;
    }
    public double calcIOF(double valor){
        double imposto=valor*taxaIOF;
        return imposto;
    }
    public double calcIR(double valor){
        double imposto=valor*taxaIR;
        return imposto;
    }
}
