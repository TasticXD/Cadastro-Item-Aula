package produtos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("\n Escolha uma opção: \n");
            System.out.println(" 1 - Cadastrar Item ");
            System.out.println(" 2 - Listar Itens ");
            System.out.println(" 3 - Sair ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do Item: ");
                    String nome = scanner.nextLine();

                    System.out.println("Quantidade do item: ");
                    int quantidade = scanner.nextInt();

                    System.out.println("Preço do item: ");
                    double preco = scanner.nextDouble();

                    Item newItem = new Item(nome, quantidade, preco);
                    estoque.adicionarItem(newItem);
                    System.out.println("Item cadastrado com sucesso!");
                    break;
                case 2:
                    estoque.listarItens();
                    break;
                case 3:
                    executando = false;
                    break;
                default:
                    System.out.println(" Opção Inválida!");
            }
        }

        scanner.close();
    }
}
