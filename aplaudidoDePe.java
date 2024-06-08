import java.util.Scanner;
public class aplaudidoDePe {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int repeticoes=input.nextInt();
        for(int i=1;i<=repeticoes;i++){
            input.nextInt();
            String publico=input.next();
            int convidados=0;
            int pessoas=0;
            for(int d=0;i<publico.length();d++){
                if(pessoas<d){
                    convidados+=d-pessoas;
                    pessoas+=d-pessoas;
                }
                pessoas+=publico.charAt(d)-'0';
            }
            System.out.printf("Case #%d: %d\n",i, convidados);
        }
        input.close();
    }
}
