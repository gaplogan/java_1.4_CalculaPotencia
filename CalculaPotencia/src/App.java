import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int N, p, Pote, j;

        System.out.print("Digite o n�mero a ser potenciado: ");
        N = entrada.nextInt();
        System.out.print("Digite a pot�ncia desejada: ");
        p = entrada.nextInt();

        while ((p < 0) || (N <= 1)) {
            System.out.println("Entrada inv�lida");
            System.out.println();
            System.out.print("Digite o n�mero a ser potenciado: ");
            N = entrada.nextInt();
            System.out.print("Digite a pot�ncia desejada: ");
            p = entrada.nextInt();
        }

        Pote = 1;

        if (p > 0) { // se a pot�ncia pe maior que zero
            for (j = 1; j <= p; j++) { //calcula pot�ncia com loop
                Pote = Pote * N;
            }
        }

        System.out.println();
        System.out.println(N + " elevado a " + p + " : " + Pote);

        entrada.close();     
    }
}
