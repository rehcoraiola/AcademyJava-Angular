
    public class at16_1{
        public static void main(String[] args) {
            CalculadoraTaxas c=new CalculadoraTaxas();
            double valor=10000.00;
            double T=c.CalcTransferencia(valor);
            System.out.printf("Tranferencia %.2f",T);

            System.out.println();
            for (int i = 0; i < 11; i++) {
                double S=c.CalcSaque(valor);
                System.out.printf("Saque %.2f \n",S);
            }
        }
}