import java.util.LinkedList;
import java.util.Scanner;

public class SistemaFila {

    public static void main(String[] args) {
        // Usa uma LinkedList para representar a fila, pois permite adicionar elementos no final eficientemente
        LinkedList<String> fila = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        // Loop principal do sistema
        while (true) {
            // Mostra o menu de opções
            System.out.println("\nSistema de Fila");
            System.out.println("1. Adicionar nome à fila");
            System.out.println("2. Chamar próximo da fila");
            System.out.println("3. Sair");

            // Lê a opção do usuário
            System.out.print("Digite sua opção: ");
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do scanner

            // Processa a opção escolhida
            switch (opcao) {
                case 1:
                    // Lê o nome a ser adicionado
                    System.out.print("Digite o nome: ");
                    String nome = input.nextLine();
                    
                    // Adiciona o nome ao final da fila
                    fila.offer(nome);
                    System.out.println(nome + " adicionado à fila.");
                     // Mostra todos os nomes na fila
                     if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Fila atual:");
                        for (String n : fila) {
                            System.out.println(n);
                        }
                    }
                    break;

                case 2:
                    // Verifica se a fila está vazia
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        // Remove e mostra o primeiro nome da fila
                        String proximoNome = fila.poll();
                        System.out.println(proximoNome + " é o próximo da fila.");
                    }
                    // Mostra todos os nomes na fila
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Fila atual:");
                        for (String n : fila) {
                            System.out.println(n);
                        }
                    }
                    break;            
                case 3:
                    // Sai do programa
                    System.out.println("Saindo do sistema...");
                    input.close();
                    return;
                default:
                    // Mensagem de erro para opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

