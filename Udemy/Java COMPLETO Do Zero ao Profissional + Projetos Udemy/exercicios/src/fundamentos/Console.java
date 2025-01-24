package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println(" dia!");

        System.out.printf("%nMegasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);

        System.out.printf("%nNome: %s%n", "João");
        System.out.printf("Salário: R$%.1f", 1234.5678);

        System.out.println("\n");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.printf("%nNome digitado: %s %s", nome, sobrenome);

        System.out.print("\n\nQuantos anos você tem? ");
        int idade = entrada.nextInt();

        System.out.printf("%n%s %s tem %d anos de idade.", nome, sobrenome, idade);

        System.out.print("\nQuanto você ganha? R$");
        double salario = entrada.nextDouble();

        System.out.printf("O %s %s recebe R$%.2f", nome, sobrenome, salario);

        entrada.close();
    }
}
