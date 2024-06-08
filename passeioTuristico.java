import java.util.Scanner;
public class passeioTuristico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt(); // Número de cidades
            int Ts = scanner.nextInt(); // Tempo gasto para passear
            int Tf = scanner.nextInt(); // Último horário para chegar na cidade N

            int[][] buses = new int[N - 1][3]; // Horário de início, frequência e duração dos ônibus
            for (int i = 0; i < N - 1; i++) {
                buses[i][0] = scanner.nextInt();
                buses[i][1] = scanner.nextInt();
                buses[i][2] = scanner.nextInt();
            }

            // Inicializa um array para armazenar o máximo de cidades onde você pode passear
            int[] maxCidades = new int[N];
            maxCidades[0] = 0; // Você não pode passear na cidade de partida

            // Simulação da viagem pelas cidades
            for (int i = 1; i < N; i++) {
                maxCidades[i] = Integer.MIN_VALUE;
                for (int j = 0; j < i; j++) {
                    int espera = maxCidades[j] == Integer.MIN_VALUE ? 0 : maxCidades[j] + Ts;
                    int tempoChegada = espera + (buses[j][0] > espera ? buses[j][0] - espera : 0);
                    if (tempoChegada + buses[j][2] <= buses[j][1]) {
                        // Se for possível pegar o ônibus, atualiza o número máximo de cidades onde você pode passear
                        maxCidades[i] = Math.max(maxCidades[i], j + 1);
                    }
                }
            }

            int maxCidadesPossiveis = -1;
            for (int i = 0; i < N; i++) {
                if (maxCidades[i] != Integer.MIN_VALUE && maxCidades[i] <= N - 1) {
                    maxCidadesPossiveis = i;
                }
            }

            // Verifica se é possível chegar à cidade N no tempo Tf
            if (maxCidadesPossiveis == -1 || maxCidadesPossiveis + 1 + buses[maxCidadesPossiveis][0] > Tf) {
                System.out.printf("Case #%d: IMPOSSIBLE%n", t);
            } else {
                System.out.printf("Case #%d: %d%n", t, maxCidadesPossiveis);
            }
        }
        scanner.close();
    }
}
