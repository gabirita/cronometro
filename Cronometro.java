import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Projeto: Cronômetro para Estudos
 * Autor: [Seu Nome]
 * Data de Criação: [Coloque a data aqui]
 * Descrição: 
 * Um cronômetro para ajudar nos estudos com funcionalidades de iniciar, 
 * pausar, retomar e reiniciar o tempo definido pelo usuário.
 * 
 * Versão: 1.0
 */
public class Cronometro {
    private static int tempoInicial;      // Tempo inicial definido pelo usuário
    private static int segundosRestantes; // Tempo restante no cronômetro
    private static boolean pausado = false; // Estado do cronômetro (pausado ou não)
    private static Timer timer = new Timer(); // Objeto Timer para gerenciar a contagem

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cronômetro para Estudos ===");
        System.out.print("Digite o tempo em segundos: ");
        tempoInicial = scanner.nextInt();
        segundosRestantes = tempoInicial;

        exibirMenu(scanner);
        scanner.close();
    }

    // Exibe o menu e permite ao usuário escolher ações
    private static void exibirMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Iniciar Cronômetro");
            System.out.println("2. Pausar Cronômetro");
            System.out.println("3. Retomar Cronômetro");
            System.out.println("4. Reiniciar Cronômetro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iniciarCronometro();
                    break;
                case 2:
                    pausarCronometro();
                    break;
                case 3:
                    retomarCronometro();
                    break;
                case 4:
                    reiniciarCronometro();
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    if (timer != null) {
                        timer.cancel();
                    }
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Inicia o cronômetro ou reinicia se já estava rodando
    private static void iniciarCronometro() {
        if (segundosRestantes <= 0) {
            System.out.println("Tempo já esgotado. Reinicie o cronômetro.");
            return;
        }

        if (timer != null) {
            timer.cancel();
        }
        timer = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                if (!pausado) {
                    if (segundosRestantes > 0) {
                        segundosRestantes--;
                        System.out.println("Tempo restante: " + formatarTempo(segundosRestantes));
                    } else {
                        System.out.println("Tempo esgotado!");
                        timer.cancel();
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, 1000);
        System.out.println("Cronômetro iniciado.");
    }

    // Pausa o cronômetro
    private static void pausarCronometro() {
        if (segundosRestantes > 0) {
            pausado = true;
            System.out.println("Cronômetro pausado.");
        } else {
            System.out.println("Cronômetro já está parado.");
        }
    }

    // Retoma o cronômetro se ele estiver pausado
    private static void retomarCronometro() {
        if (pausado) {
            pausado = false;
            System.out.println("Cronômetro retomado.");
        } else {
            System.out.println("O cronômetro já está rodando.");
        }
    }

    // Reinicia o cronômetro para o tempo inicial
    private static void reiniciarCronometro() {
        pausado = false;
        segundosRestantes = tempoInicial;
        System.out.println("Cronômetro reiniciado para " + formatarTempo(tempoInicial));
        iniciarCronometro();
    }

    // Formata o tempo em mm:ss
    private static String formatarTempo(int segundos) {
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        return String.format("%02d:%02d", minutos, segundosRestantes);
    }
}
