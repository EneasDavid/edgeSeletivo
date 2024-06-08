import java.util.Scanner;

public class VingancaDasPanquecas {
    //ler a quantidade de repeticoes
    //ler a string de panquecas
    //calcular o numero minimo de viradas necessarias
    //imprimir o resultado
    public static int minViradas(String panquecas) {
        int numViradas=0;
        int qtnPanquecas=panquecas.length();
        for (int i=0;i<qtnPanquecas-1;i++) {
            if (panquecas.charAt(i)!=panquecas.charAt(i+1)) numViradas++;
        }
        if (panquecas.charAt(qtnPanquecas-1)=='-') numViradas++;
        return numViradas;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int repeticoes=input.nextInt();
        input.nextLine();
        for (int i=1;i<=repeticoes;i++){
            String panquecas=input.nextLine();
            int minViradasNecessarias=minViradas(panquecas);
            System.out.printf("Case #%d: %d\n",i,minViradasNecessarias);
        }
        input.close();
    }
}