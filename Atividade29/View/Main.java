package View;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.CategoriaController;
import Controller.ProdutoController;
import Model.Categoria;
import Model.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();
        CategoriaController categoriaController = new CategoriaController();
        int op = 0, op2 = 0;

        do {
            menu();
            System.out.print("\nDigite a opção escolhida: ");
            op = escolher_menu(sc.nextInt(), 1, 5, sc);

            switch (op) {
            case 1:
                menu2("CADASTRAR");
                op2 = escolher_menu(sc.nextInt(), 1, 2, sc);
                if (op2 == 1) {
                    cadastrar_produto(produtoController, categoriaController, sc);
                }else{
                    cadastrar_categoria(categoriaController, sc);
                }
                break;
            case 2:
                menu2("ATUALIZAR");
                op2 = escolher_menu(sc.nextInt(), 1, 2, sc);
                if(op2 == 1){
                    atualizar_produto(produtoController, categoriaController, sc);
                }else{
                    atualizar_categoria(categoriaController, sc);
                }
                break;
            case 3:
                menu2("LISTAR");
                op2 = escolher_menu(sc.nextInt(), 1, 2, sc);
                if (op2 == 1) {
                    listar_produtos(produtoController);
                    
                }else{
                    listar_categorias(categoriaController);
                }
                break;
            case 4:
                menu2("DELETAR");
                op2 = escolher_menu(sc.nextInt(), 1, 2, sc);
                if(op2 == 1){
                    deletar_produto(produtoController, sc);
                }else{
                    deletar_categoria(categoriaController, sc);
                }
                break;
            case 5:
                System.out.println("Saindo do programa... ");
                break;
            }
        } while(op != 5);

    }

    private static void menu() {
        System.out.print("\n========== Menu de Opções ==========");
        System.out.print("\n\t1 - Cadastrar");
        System.out.print("\n\t2 - Atualizar");
        System.out.print("\n\t3 - Listar");
        System.out.print("\n\t4 - Deletar");
        System.out.print("\n\t5 - Para sair");
    }

    private static void menu2(String metodo) {
        System.out.printf("\nEscolha uma das opções para %s: ", metodo);
        System.out.println("\n\t1 - Produto");
        System.out.println("\n\t2 - Categoria");
    }

    private static int escolher_menu(int op, int a, int b, Scanner sc) {
        while (op < a || op > b) {
            System.out.print("Opção inválida. Digite novamente: ");
            op = sc.nextInt();
        }
        return op;
    }

    private static void cadastrar_produto(ProdutoController controller, CategoriaController categoriaController, Scanner sc) {
        Categoria novaCategoria = new Categoria();

        Produto novoProduto = new Produto();
        System.out.print("\nDigite o ID do produto: ");
        novoProduto.id = sc.nextInt();
        System.out.print("\nDigite o nome do produto: ");
        novoProduto.nomeProduto = sc.next();
        System.out.print("\nDigite a descrição do produto: ");
        novoProduto.descricao = sc.next();
        System.out.print("\nDigite o valor do produto: ");
        novoProduto.valor = sc.nextDouble();

        System.out.print("\nDigite o ID da categoria: ");
        novaCategoria.id = sc.nextInt();
        System.out.print("\nDigite o nome da categoria: ");
        novaCategoria.nomeCategoria = sc.next();

        novoProduto.categoria = novaCategoria;
        controller.create(novoProduto);
        categoriaController.create(novaCategoria);
        System.out.println("Produto criado com sucesso!");
    }

    private static void cadastrar_categoria(CategoriaController controller, Scanner sc) {
        Categoria novaCategoria = new Categoria();
        System.out.print("\nDigite o ID da categoria: ");
        novaCategoria.id = sc.nextInt();
        System.out.print("\nDigite o nome da categoria: ");
        novaCategoria.nomeCategoria = sc.next();

        controller.create(novaCategoria);
        System.out.println("Categoria criada com sucesso!");
    }

    private static void listar_produtos(ProdutoController controller) {
        ArrayList<Produto> listaProduto = controller.read();
        System.out.println(listaProduto);
    }

    private static void listar_categorias(CategoriaController controller){
        ArrayList<Categoria> listaCategoria = controller.read();
        System.out.println(listaCategoria);
    }

    private static void deletar_produto(ProdutoController controller, Scanner sc){
        Produto produtoDeletar = new Produto();
        System.out.println("Digite o ID do produto a ser removido: ");
        int idInformado = sc.nextInt();
        produtoDeletar.id = idInformado;
        controller.delete(produtoDeletar);
        System.out.println("Produto deletado com sucesso!");
    }

    private static void deletar_categoria(CategoriaController controller, Scanner sc){
        Categoria categoriaDeletar = new Categoria();
        System.out.println("Digite o ID da categoria a ser removida: ");
        int idInformado = sc.nextInt();
        categoriaDeletar.id = idInformado;
        controller.delete(categoriaDeletar);
        System.out.println("Categoria deletada com sucesso!");
    }
    
    private static void atualizar_categoria(CategoriaController controller, Scanner sc){
        Categoria categoriaAtualizar = new Categoria();
        System.out.print("\nDigite o ID da categoria: ");
        categoriaAtualizar.id = sc.nextInt();
        System.out.print("\nDigite o nome da categoria: ");
        categoriaAtualizar.nomeCategoria = sc.next();

        controller.update(categoriaAtualizar);
        System.out.println("Categoria atualizada com sucesso!");
    }

    private static void atualizar_produto(ProdutoController controller, CategoriaController categoriaController, Scanner sc) {
        Categoria categoriaAtualizar = new Categoria();

        Produto produtoAtualizar = new Produto();
        System.out.print("\nDigite o ID do produto: ");
        produtoAtualizar.id = sc.nextInt();
        System.out.print("\nDigite o nome do produto: ");
        produtoAtualizar.nomeProduto = sc.next();
        System.out.print("\nDigite a descrição do produto: ");
        produtoAtualizar.descricao = sc.next();
        System.out.print("\nDigite o valor do produto: ");
        produtoAtualizar.valor = sc.nextDouble();

        System.out.print("\nDigite o ID da categoria: ");
        categoriaAtualizar.id = sc.nextInt();
        System.out.print("\nDigite o nome da categoria: ");
        categoriaAtualizar.nomeCategoria = sc.next();

        produtoAtualizar.categoria = categoriaAtualizar;
        controller.update(produtoAtualizar);
        categoriaController.update(categoriaAtualizar);
        System.out.println("Produto atualizado com sucesso!");
    }
}