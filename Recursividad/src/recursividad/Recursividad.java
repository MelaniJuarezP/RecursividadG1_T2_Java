package recursividad;
/**
 * @author Melani Lizbeth Juarez Pacheco
 */
public class Recursividad {

    public static void main(String[] args) {
        Recursividades oRecursividad = new Recursividades();
        
        System.out.println("Sumar vocales");
        String cadena = "ParangaricutirimicUARO";
        int contar= oRecursividad.vocales(cadena);
        System.out.println("Numero de vocales en '" + cadena + "' es : " + contar);
        
        System.out.println("\nSumar digitos");
        int[] numeros = {123, 4567, 99,14};
        int maxNumero = 0;
        int maxSuma = -1;        
        for (int num : numeros) {
            int sumaActual = oRecursividad.sumaDigitos(num);
            System.out.println("Número: " + num + ", Suma de sus dígitos: " + sumaActual);

            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                maxNumero = num;
            }
        }
        System.out.println("\nEl entero con la mayor suma de dígitos es: " + maxNumero);
    
        System.out.println("\nSuma de los primeros digitos");
        int num=5;
        int n = oRecursividad.sumaNumeros(num);
        System.out.println("La suma de los primeros " + num + " números es: " + n);
    }
}
