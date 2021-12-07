public class at17_1 {
    public static void main(String[] args) {
        CalcImposto c =new CalcImposto();
        double valor = 1000.00;

        System.out.printf("O valor do imposto para IOF: %.4f \n", c.calcIOF(valor));
        System.out.printf("O valor do imposto para IR: %.4f \n", c.calcIR(valor));
        System.out.printf("O valor do imposto para ISS: %.4f \n", c.calcISS(valor));
    }
}