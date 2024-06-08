import java.util.HashMap;
import java.util.Scanner;

public class FalandoEmLinguas {

    public static HashMap<Character, Character> construirMapeamento() {
        String googlerese = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String ingles = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up";
        HashMap<Character, Character> mapeamento = new HashMap<>();
        for (int i = 0; i < googlerese.length(); i++) {
            char g = googlerese.charAt(i);
            char e = ingles.charAt(i);
            if (g != ' ') mapeamento.put(g, e);
        }

        mapeamento.put('q', 'z');
        mapeamento.put('z', 'q');
        return mapeamento;
    }

    public static String traduzirTexto(String googlerese, HashMap<Character, Character> mapeamento) {
        StringBuilder traducao = new StringBuilder();
        for (char letra : googlerese.toCharArray()) {
            if (letra == ' ') traducao.append(' ');
            else traducao.append(mapeamento.get(letra));
        }
        return traducao.toString();
    }

    public static void main(String[] args) {
        // Constrói o mapeamento
        HashMap<Character, Character> mapeamento = construirMapeamento();

        // Cria um scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Lê o número de casos de teste
        int T = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos

        for (int t = 1; t <= T; t++) {
            String googlerese = scanner.nextLine();
            String traducao = traduzirTexto(googlerese, mapeamento);
            System.out.println("Case #" + t + ": " + traducao);
        }
        scanner.close();
    }
}
