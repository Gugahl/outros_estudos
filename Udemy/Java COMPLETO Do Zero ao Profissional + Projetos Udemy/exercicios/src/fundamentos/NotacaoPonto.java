package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "princesa! Por favor sente na glock, todos seus desejos eu realizo a firma é forte");
        s = s.concat("!!!");
        s = s.toUpperCase();

        System.out.println(s);
        System.out.println("Leo".toUpperCase());

        String y = "Bom dia X"
        .replace("X", "Gui")
        .toLowerCase()
        .concat("!!!");
        
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
    }
}
