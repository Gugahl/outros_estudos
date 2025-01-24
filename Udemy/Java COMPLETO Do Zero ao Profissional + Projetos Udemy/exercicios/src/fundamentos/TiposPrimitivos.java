package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações dos funcionários
        
        // Tipos numéricos inteiros
        byte anosdeEmpresa = 23;
        short numerodeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estadeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        int diasdeEmpresa = anosdeEmpresa * 365;
        System.out.println("O funcionário Gustavo tem " + diasdeEmpresa + " dias na empresa Donna Bella");

        // Número de viagens
        short viagens = (short) (numerodeVoos / 2);
        System.out.println("O funcionário fez " + viagens + " viagens ao longo de sua carreira.");

        // Pontos por real
        double pontosporRealVendido = pontosAcumulados/vendasAcumuladas;
        System.out.println("O funcionário ganha " + pontosporRealVendido + " pontos a cada 1 real em vendas.");

        // Salário do funcionário
        System.out.println("O funcionário de id " + id + " ganha R$" + salario + " por mês.");

        // O funcionário ativo?
        System.out.println(" O funcionário está ativo? ");
        if (status == 'A') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        // O funcionário está de férias?
        System.out.println(" O funcionário está de férias? ");
        if (estadeFerias == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
