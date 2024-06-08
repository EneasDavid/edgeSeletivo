import java.util.Scanner;

public class C_IPLF {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        input.nextLine();
        String entrada=input.nextLine();
        int Q=input.nextInt();
        char[] entradaArray=entrada.toCharArray();
        for (int i=0; i<Q; i++) {
            int comando=input.nextInt();
            int A=input.nextInt();
            int B=input.nextInt();
            if(comando==1){
                entradaArray[A-1]^=entradaArray[B-1];
                entradaArray[B-1]^=entradaArray[A-1];
                entradaArray[A-1]^=entradaArray[B-1];
                
            }else{
                for (int d=0; d<N; d++) {
                    entradaArray[d]^=entradaArray[d+N];
                    entradaArray[d+N]^=entradaArray[d];
                    entradaArray[d]^=entradaArray[d+N];
                }
            }
        }
        System.out.printf("%s\n", new String(entradaArray));
        input.close();
    }
}
