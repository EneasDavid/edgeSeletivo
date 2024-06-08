import java.util.Scanner;

public class contandoOvelhas {
    public static boolean verificaDigitos(int[] digitos){
        for(int d=0; d<10; d++) {
            if(digitos[d]==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int repeticoes=input.nextInt();
        for(int t=1; t<=repeticoes; t++) {
            int numeroEscolhido=input.nextInt();
            int[] digitos=new int[10];
            for(int i=1; i<=100; i++){
                int numero=numeroEscolhido*i;
                while(numero>0){
                    digitos[numero%10]=1;
                    numero/=10;
                }
                if(verificaDigitos(digitos)){
                    System.out.printf("Case #%d: %d\n",t, numeroEscolhido*i);
                    break;
                }
            }
            if(digitos[0]==0){
                System.out.printf("Case #%d: INSOMNIA\n",t);
            }
        }
        input.close();
    }
}
