package numeros;

/**
 *
 * @author kaztro
 */

public class Numeros {

    public static void main(String[] args) {
        Metodos numeros = new Metodos();
        
        System.out.println("9 es par");
        System.out.println(numeros.Par(9));
        System.out.println("54.56 es par");
        System.out.println(numeros.Par(54.56));
        System.out.println("321 es multiplo de 5456");
        System.out.println(numeros.Multiplo(321, 5456));
        System.out.println("7 es numero primo");
        System.out.println(numeros.Primo(7));
    }
    
}
