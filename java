import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaAtendimento {
    public static void main(String[] args) {
        final int CAPACIDADE_MAXIMA = 5;
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // limpar buffer

            switch (opcao) {
                case 1:
                    if (fila.size() < CAPACIDADE_MAXIMA) {
                        System.out.print("Nome do cliente: ");
                        String nome = scanner.nextLine();
                        fila.add(nome);
                        System.out.println(nome + " foi adicionado à fila.");
                    } else {
                        System.out.println("Fila cheia! Não é possível adicionar mais clientes.");
                    }
                    mostrarFila(fila);
                    break;

                case 2:
                    if (!fila.isEmpty()) {
                        String atendido = fila.poll();
                        System.out.println(atendido + " foi atendido.");
                    } else {
                        System.out.println("Fila vazia! Nenhum cliente para atender.");
                    }
                    mostrarFila(fila);
                    break;

                case 3:
                    System.out.println("Encerrando sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        scanner.close();
    }

    public static void mostrarFila(Queue<String> fila) {
        System.out.println("Fila atual: " + fila);
    }
}
