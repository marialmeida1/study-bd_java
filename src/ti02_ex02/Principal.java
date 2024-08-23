package ti02_ex02;

import ti02_ex02.Produto;
import ti02_ex02.DAO;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        DAO produtoDAO = new DAO();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            // Exibe o menu
        	System.out.println("=========================");
            System.out.println("Escolha uma opção:");
            System.out.println("=========================");
            System.out.println("1. Listar produtos");
            System.out.println("2. Inserir produto");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Excluir produto");
            System.out.println("5. Sair");
            System.out.println("=========================");
            System.out.print("Sua opção: ");

            // Lê a opção do usuário
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            System.out.println("=========================");

            switch (opcao) {
                case 1:
                    // Listar produtos
                    List<Produto> produtos = produtoDAO.listar();
                    for (Produto produto : produtos) {
                        System.out.println(produto.getId() + ": " + produto.getNome() + " - " + produto.getDescricao());
                    }
                    break;

                case 2:
                    // Inserir produto
                    Produto novoProduto = new Produto();
                    System.out.println("Digite o nome do produto:");
                    novoProduto.setNome(scanner.nextLine());
                    System.out.println("Digite a descrição do produto:");
                    novoProduto.setDescricao(scanner.nextLine());
                    produtoDAO.inserir(novoProduto);
                    System.out.println("Produto inserido com sucesso.");
                    break;

                case 3:
                    // Atualizar produto
                    System.out.println("Digite o ID do produto a ser atualizado:");
                    int idParaAtualizar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    Produto produtoParaAtualizar = produtoDAO.buscarPorId(idParaAtualizar);
                    if (produtoParaAtualizar != null) {
                        System.out.println("Digite o novo nome do produto:");
                        produtoParaAtualizar.setNome(scanner.nextLine());
                        System.out.println("Digite a nova descrição do produto:");
                        produtoParaAtualizar.setDescricao(scanner.nextLine());
                        produtoDAO.atualizar(produtoParaAtualizar);
                        System.out.println("Produto atualizado com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    // Excluir produto
                    System.out.println("Digite o ID do produto a ser excluído:");
                    int idParaExcluir = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    produtoDAO.excluir(idParaExcluir);
                    System.out.println("Produto excluído com sucesso.");
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    
    }
}
