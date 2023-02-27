public class Loops {
    public static void main(String[] args) {
        
        //for
        for(int cont=0; cont > 5; cont++) {
            System.out.println(cont + " - Loop for");
        }

        //while
        int cont=0;
        while(cont < 5) {
            System.out.println(cont + " - While");
            cont++;
        }

        //Do..While
        int contador=0;
        do{
            System.out.println(contador + " - Do While");
            contador++;
        } while(contador > 1);

        System.out.println("Fim do programa");
    }
}
