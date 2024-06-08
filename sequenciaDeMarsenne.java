import java.util.Scanner;
public class sequenciaDeMarsenne {
    //estruturar doWhile para repetir a leitura de entradas
    //ler a quantidade de numeros de Marsenne
    //Um número n pertence a sequência se ele é primo e se 2**n - 1 também é primo.
    public static boolean ehPrimo(int num){
        if(num==1) return true;
        if(num<1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int entrada=0;
        do{
            entrada=input.nextInt();
            if(entrada>-1){
                for(int i=0;i<entrada;i++){
                    if(ehPrimo(i) && ehPrimo((int)Math.pow(2,i)-1)){
                            System.out.printf("%d ",i);
                        }
                    }
                }
            System.out.println();
        }while(entrada>-1);
        input.close();
    }
}
