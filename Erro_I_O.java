import java.util.Scanner;

public class Erro_I_O{
    public static void main(String [] args){
        //Receber a quantidade de repetição
        //ler entrada (entrada/8)=qtnCaracter
        //converter de I e O para 1 0 (replace?)
        //traduzir de binario para decimal
        //imprimir resultado
        Scanner input=new Scanner(System.in);
        int repeticoes=input.nextInt();
        for(int i=1;i<=repeticoes;i++){
            int numeroBytes=input.nextInt();
            String entradaSemConversao=input.next();
            String entradaConvertida=entradaSemConversao.replace("I","1").replace("O","0");
            String resultado="";
            for(int d=0;d<numeroBytes;d++){
                String binario=entradaConvertida.substring(d*8,d*8+8);
                int decimal=Integer.parseInt(binario,2);
                resultado+=Character.toString((char)decimal);
            }
            System.out.printf("Case #%d: %s\n",i,resultado);
        }
        input.close();
    }
}
