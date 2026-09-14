package recursividad;

/**
 *
 * @author Melani
 */
class Recursividades {
     public int vocales(String texto) {
        if (texto.isEmpty()) {
            return 0;
        }
        
        char primero = Character.toLowerCase(texto.charAt(0));
        int esVocal = (primero == 'a' || primero == 'e' || primero == 'i' || primero == 'o' || primero == 'u') ? 1 : 0;
        
        return esVocal + vocales(texto.substring(1));
    }
     public int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }
     public int sumaNumeros(int n) {
        if (n <= 0) {
            return 0;
        }
        return sumaNumeros(n - 1) + n;
    }
}
