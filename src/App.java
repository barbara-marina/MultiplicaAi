import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Insira o valor desejado para obter a tabuada : ");
        int x = numero.nextInt();

        System.out.printf("Tabela de multiplicação de %d: \n", x);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }

    }
}
