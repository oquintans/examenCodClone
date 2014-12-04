//CLONE
package examencod;

public class ExamenCOD {

    public static void main(String[] args) {
        int num = 11;
        if (calcularPrimo(num)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int cont = 2; cont < 1000; cont++) {
            if (calcularPrimo(cont)) {
                System.out.print(cont + " ");
            }
        }
    }

    public static boolean calcularPrimo(int variable) {
        int aux = 2;
        boolean result = true;
        while ((result) && (aux != variable)) {
            if (variable % aux == 0) {
                result = false;
            }
            aux++;
        }
        return result;
    }

}
