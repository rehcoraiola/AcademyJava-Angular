package Atividade6;

public class a6_3 {
    public static void main(String[] args) {
    
    double valorInvestimento= 5000, taxaJuros = 0.02, retornoMensal = 0.0, totalRetorno = 0.0;
    int quantidadeMeses = 24;
    
    System.out.println("====================================================");
    System.out.println("O valor de retorno do investimento mês a mês é de: ");
    
    for (int i = 0; i < quantidadeMeses; i++) {
        retornoMensal = valorInvestimento * taxaJuros;
        valorInvestimento += retornoMensal;
        System.out.printf("\t Mês %d: R$ %.2f \n", i+1, valorInvestimento);
        totalRetorno += retornoMensal;
    }
        System.out.printf("O total do retorno dos 24 meses é de: R$ %.2f \n", totalRetorno);
        System.out.println("====================================================");
        }
}
