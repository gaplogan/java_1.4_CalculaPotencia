import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int N, p, Pote, j;

        System.out.print("Digite o número a ser potenciado: ");
        N = entrada.nextInt();
        System.out.print("Digite a potência desejada: ");
        p = entrada.nextInt();

        while ((p < 0) || (N <= 1)) {
            System.out.println("Entrada inválida");
            System.out.println();
            System.out.print("Digite o número a ser potenciado: ");
            N = entrada.nextInt();
            System.out.print("Digite a potência desejada: ");
            p = entrada.nextInt();
        }

        Pote = 1;

        if (p > 0) { // se a potência pe maior que zero
            for (j = 1; j <= p; j++) { //calcula potência com loop
                Pote = Pote * N;
            }
        }

        System.out.println();
        System.out.println(N + " elevado a " + p + " : " + Pote);

        entrada.close();     
    }
}
