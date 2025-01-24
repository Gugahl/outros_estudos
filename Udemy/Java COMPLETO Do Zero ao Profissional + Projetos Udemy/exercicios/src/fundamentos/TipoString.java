package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        // Manipulação de Strings
        System.out.println("Olá pessoal".charAt(0)); // Puxa o caractere que está na posição especificada

        String s = "Boa tarde";
        s = s.toUpperCase(); // Transforma a string em UpperCase
        System.out.println(s.concat("!!!")); // Concatena uma string em outra
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); // Retorna se a string começa com o valor especificado
        System.out.println(s.startsWith("b"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("tarde")); // Retorna se a string termina com o valor especificado
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length()); // Retorna o tamanho da string
        System.out.println(s.equals("boa tarde")); // Retorna se a string é igual ao valor especificado
        System.out.println(s.equalsIgnoreCase("boa tarde")); // Retorna se a string é igual ao valor especificado ignorando os cases
        System.out.println(s.toLowerCase().equals("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + "\n\n");

        System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nSalário: %f \n\n", nome, sobrenome, idade, salario);

        // Format
        System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);
        // %s Strings, %d Valores Inteiros e %f Pontos Flutuantes
        
        String frase = String.format("\n\nO senhor %s %s tem %d anos e recebe R$%.2f", nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); // Verifica se dentro da string tem a string "qual"

        System.out.println("Frase qualquer".indexOf("qual")); // Verifica o índice da string "qual" dentro da string

        System.out.println("Frase qualquer".substring(6)); // Manda o sistema printar a partir do índice 6

        System.out.println("Frase qualquer".substring(6, 8)); // Manda o sistema printar a partir do índice 6 até o índice anterior ao índice final, nesse caso 7

    }
}
