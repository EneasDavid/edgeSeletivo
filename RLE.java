import java.util.Scanner;

public class RLE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNextLine()) {
            String linha=input.nextLine();
            int count=0;
            int tamanho=linha.length();
            for(int i=0; i < tamanho; i++) {
                char atual=linha.charAt(i);
                if(Character.isDigit(atual)) count=count*10+(atual-'0');
                else{
                    if(i==tamanho-1) count--;
                    for(int j=0; j<count; j++) {
                        System.out.printf("%c ",atual);
                    }
                    count=0; 
                }
            }
            System.out.printf("%c\n",linha.charAt(linha.length()-1));
        }
        input.close();
    }
}