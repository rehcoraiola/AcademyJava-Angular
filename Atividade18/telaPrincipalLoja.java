public class telaPrincipalLoja {
    public static void main(String[] args) {
        produto p=new produto();
        p.setCodigo(1234);
        p.setNome("Arroz");
        p.setDescricao("Arborio Paganini");
        p.setValor(20.00);

        System.out.printf("Código: %d \n",p.getCodigo());
        System.out.printf("Nome: %s \n",p.getNome());
        System.out.printf("Descrição: %s \n",p.getDescricao());
        System.out.printf("Valor: %.2f \n",p.getValor());
        
    }
}
