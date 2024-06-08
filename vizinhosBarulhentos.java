import java.util.Scanner;
public class vizinhosBarulhentos {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int repeticoes=input.nextInt();
        for(int i=1;i<=repeticoes;i++){
            int qtnLargura, qntAltura, qntOcupacao;
            qtnLargura=input.nextInt();
            qntAltura=input.nextInt();
            qntOcupacao=input.nextInt();
            int area=qtnLargura*qntAltura;
            if((area>>1)>=qntOcupacao) System.out.printf("Case #%d: %d\n",i,0);
            else if(area==qntOcupacao) System.out.printf("Case #%d: %d\n",i,qntOcupacao+1);            
            else System.out.printf("Case #%d: %d\n",i,qntOcupacao);
        }
    input.close();
    }
}