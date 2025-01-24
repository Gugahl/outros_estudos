package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159; 
        // Com final uma vez setado um valor ele não poderá ser mudado
        // Constantes devem estar em UPPERCASE
        double area = PI*(raio*raio);
        System.out.println("A área da circunferência de raio " + raio + " metros é igual a " + area + " metros quadrados.");
        // Mudando o valor do raio
        raio = 10;
        area = PI*(raio*raio);
        System.out.println("Se mudarmos o raio para " + raio + " metros quadrados, " + "teremos que a área da circunferência será de " + area + " metros quadrados.");
    }
}
