import java.util.Scanner;

public class CadPessoa {
    public static void main(String[] args) {
        PessoaFisica[] pessoas=new PessoaFisica[5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < pessoas.length; i++) {
            PessoaFisica p=new PessoaFisica();
            System.out.printf("\n Cadastro da pessoa numero %d \n",i+1);
            System.out.print("Digite o codigo: ");
            p.setCodigo(Integer.parseInt(sc.nextLine()));

            System.out.print("Digite o Nome: ");
            p.setNome(sc.nextLine());

            System.out.print("Digite o Sobrenome: ");
            p.setSobrenome(sc.nextLine());

            System.out.print("Digite o Idade: ");
            p.setIdade(Integer.parseInt(sc.nextLine()));

            System.out.print("Digite o RG: ");
            p.setRg(sc.nextLine());

            System.out.print("Digite o CPF: ");
            p.setCpf(sc.nextLine());

            pessoas[i]=p;
        }
        for (PessoaFisica pf : pessoas) {
            System.out.printf("\n \n Codigo:%d \n Nome %s %s \n idade: %d \n RG: %s \n CPF: %s",pf.getCodigo(),pf.getNome(),pf.getSobrenome(),pf.getIdade(),pf.getRg(),pf.getCpf());
        }
        
    
    }
}
