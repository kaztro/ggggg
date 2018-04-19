package numeros;


public class Metodos {
    
    /**
     * 
     * @param n
     * @return 
     */
    public boolean Par(int n) {
        return (n % 2) == 0;
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    public boolean Par(double n) {
        return (n % 2) == 0;
    }
    
    /**
     * 
     * @param n
     * @param m
     * @return 
     */
    public boolean Multiplo(int n, int m) {
        return (n % m) == 0;
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    public boolean Primo(int n) {
        int x = 1, cont = 0;
        while (x <= n) {
            if (n%x == 0) cont++;
            x++;
        }
        return cont == 2;
    }
}
