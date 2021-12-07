package Atividade9;

//import versao1.validacao.ValidaNome;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do {
            exibirMenu();
            System.out.println("Digite a opção escolhida: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarDev();
                    break;
                case 2:
                    cadastrarLinguagem();
                    break;
            }
        }
            while (opcao != 0) ;
    }

    static void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("|     Escolha uma opção:       |");
        System.out.println("+------------------------------+");
        System.out.println("| 1 - Cadastrar Dev            |");
        System.out.println("| 2 - Cadastrar Linguagem      |");
        System.out.println("| 0 - Sair                     |");
        System.out.println("+------------------------------+");
    }
    static void cadastrarDev(){
        Scanner sc = new Scanner(System.in);
        boolean invalido = true;

        System.out.println("Opção escolhida: Cadastrar desenvolvedor");
        System.out.println("Digite o nome do desenvolvedor: ");
        String nomeDesenvolvedor = sc.nextLine();
        do {
            if (nomeDesenvolvedor.length() < 3) {
                System.out.println("O nome do desenvolvedor deverá ter mais que 3 caracteres.");
                System.out.println("Digite novamente o nome do desenvolvedor: ");
            } else {
                invalido = false;
            }
        } while (invalido);
        invalido = true;
        System.out.println("Digite o sobrenome do desenvolvedor: ");
        String sobrenomeDesenvolvedor = sc.nextLine();
        do {
            if (sobrenomeDesenvolvedor.length() < 3) {
                System.out.println("O sobrenome do desenvolvedor deverá ter mais que 3 caracteres.");
                System.out.println("Digite novamente o sobrenome do desenvolvedor: ");
            } else {
                invalido = false;
            }
        } while (invalido);
        invalido = true;
        System.out.println("Informe o nível de senioridade do desenvolvedor: ");
        String senioridadeDesenvolvedor = sc.nextLine();
        do {
            invalido = false;
        } while (invalido);
        invalido = true;
        System.out.println("Digite a idade do desenvolvedor: ");
        int idadeDesenvolvedor = sc.nextInt();
        do {
            if (idadeDesenvolvedor <= 0) {
                System.out.println("A idade informada não é válida!");
                System.out.println("Digite novamente a idade do desenvolvedor: ");
            } else {
                invalido = false;
            }
        } while (invalido);
        System.out.println("Cadastro de desenvolvedor realizado com sucesso!");
        System.out.println("Resumo dos dados inseridos do desenvolvedor: ");
        System.out.printf("Nome: %s.", nomeDesenvolvedor);
        System.out.printf("Sobrenome: %s.", sobrenomeDesenvolvedor);
        System.out.printf("Senioridade: %s.", senioridadeDesenvolvedor);
        System.out.printf("Idade: %d anos.", idadeDesenvolvedor);
    }

    static void cadastrarLinguagem() {

        CadLinguagem lg = new CadLinguagem();
        String nomeLinguagem;
        String descricao;

        boolean isValida = true;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe o nome da linguagem: ");
            nomeLinguagem= sc.nextLine();
            if (ValidaNome(nomeLinguagem) == true){
                lg.setNomeLinguagem(nomeLinguagem);
                break;
            } else{ System.out.printf("Erro, nome deve conter no mínimo 3 caracteres !!!\n");};
        }while (isValida);

        do {
            System.out.println("Informe a descrição da linguagem: ");
            descricao = sc.nextLine();
            if (ValidaNome(descricao) == true){
               lg.setDescricao(descricao);
                break;
            } else{ System.out.printf("Erro, descrição deve conter no mínimo 3 caracteres !!!\n");};
        }while (isValida);

        boolean opalVal = true;
        do{
            Scanner menu = new Scanner (System.in);

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-------------------------------|\n");
            System.out.print("| Opção 1 - FRONTEND            |\n");
            System.out.print("| Opção 2 - BACKEND             |\n");
            System.out.print("| Opção 3 - MOBILE              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");
            System.out.print("Opção escolhida: ");
            int opcao = menu.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Opção selecionada: Frontend");
                    lg.setAplicacao("Frontend");
                    break;
                case 2:
                    System.out.println("Opção selecionada: Backend");
                    lg.setAplicacao("Backend");
                    break;
                case 3:
                    System.out.println("Opção selecionada: Mobile");
                    lg.setAplicacao("Mobile");
                    break;
            }
        }while(opalVal = false);

        System.out.println("Cadastro de desenvolvedor realizado com sucesso!");
        System.out.println("Resumo dos dados inseridos do desenvolvedor: ");
        imprimirLinguagem("Nome da Linguagem:", lg.getNomeLinguagem());
        imprimirLinguagem("Descrição:", lg.getDescricao());
        imprimirLinguagem("Aplicação:", lg.getAplicacao());
    }

    static void imprimirLinguagem(  String nome, String descricao) {
        System.out.println(nome + ": " + descricao);
    }
    static boolean ValidaNome(String value){
        boolean valido = true;
            if(value.length() < 3){
                valido = false;
            }
            return valido;
        }
    }
