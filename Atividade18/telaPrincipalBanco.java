public class telaPrincipalBanco {
    public static void main(String[] args) {
        contaCorrente b=new contaCorrente();
        b.setAgencia(1234);
        b.setNumero(9284439);
        b.setCodCliente(001);
        b.setSaldo(20.00);

        System.out.printf("Código: %d \n",b.getAgencia());
        System.out.printf("Nome: %d \n",b.getNumero());
        System.out.printf("Descrição: %d \n",b.getCodCliente());
        System.out.printf("Valor: %.2f \n",b.getSaldo());
    }
}
