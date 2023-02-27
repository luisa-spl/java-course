import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1=0, n2=0, n3=0, n4=0, studentAverage=0;
        final int AVERAGE=7;
        String name="", res="";

        System.out.print("Digite o nome do aluno: ");
        name=scan.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1=scan.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2=scan.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3=scan.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4=scan.nextInt();
        studentAverage=(n1+n2+n3+n4)/4;

        if(studentAverage >= AVERAGE) {
            res="aprovado";
        } else if(studentAverage >= 5) {
            res="de recuperação";
        } else {
            res="reprovado";
        }

        System.out.printf("Aluno %s está %s com média final de %d", name, res, studentAverage);
    }
}

