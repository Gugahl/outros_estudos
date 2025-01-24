package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        b = 12.57;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";  // Variável declarada e inicializada ao mesmo tempo
        System.out.println(c);

        double d;  // Variável foi declarada
        d = 123.65;  // Variável foi inicializada
        System.out.println(d);  // Variável foi usada
    }
}
