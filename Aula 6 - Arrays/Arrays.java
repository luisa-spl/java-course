import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] num=new int[5];

        num[0]=10;
        num[1]=56;
        num[2]=25;
        num[3]=4;
        num[4]=15;

        int[] numeros={10,20,30,40,50,60,70,80};
        System.out.printf("%d - ", numeros[2]);

        for(int i=0; i<numeros.length; i++) {
            System.out.printf("%d - ", numeros[i]);
        }
    
        final int tam=5;
        int nota=0;
        char[] gabarito={'a', 'a', 'd', 'b','c'};
        char[] respostas=new char[tam];
        Scanner scan=new Scanner(System.in);

        for(int i=0; i<tam;i++) {
            System.out.printf("Informe a resposta %d:", i);
            respostas[i]=scan.nextLine().charAt(0);
        }

        for(int i=0; i<tam; i++) {
            if(respostas[i]==gabarito[i]) {
                nota++;
            }
        }

        System.out.printf("%nNota do aluno: %d", nota);
    }
}
