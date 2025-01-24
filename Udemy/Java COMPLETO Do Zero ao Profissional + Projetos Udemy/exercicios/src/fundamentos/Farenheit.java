package fundamentos;

public class Farenheit {
    public static void main(String[] args) {
        // De Fahrenheit para Celsius
        double Fahrenheit = 0;
        double Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println("A temperatura de " + Fahrenheit + "°F convertida em Celsius fica " + Celsius + "°C.");

        Fahrenheit = 86;
        Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println("A temperatura de " + Fahrenheit + "°F convertida em Celsius fica " + Celsius + "°C.");

        Fahrenheit = 150;
        Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println("A temperatura de " + Fahrenheit + "°F convertida em Celsius fica " + Celsius + "°C.");

        // De Celsius para Fahrenheit
        Celsius = 36;
        Fahrenheit = Celsius * 9/5 + 32;
        System.out.println("A temperatura de " + Celsius + "°C convertida em Fahrenheit fica " + Fahrenheit + "°F.");
    }
}
