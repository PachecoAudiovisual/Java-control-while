import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    // tenemos un limite hasta el que tenemos que contar

        System.out.println("ingrese el limite hasta el que quier contar");
        Scanner teclado = new Scanner(System.in);

        int limite = teclado.nextInt(); // el teclado almacena numero ingresados al sistema en la variable limite

        /*
        * while - do while - for
        * bucles controlados por contador*/

        int cont = 1;
        while (cont <= limite) {
            System.out.println("cont");
            cont ++;
        }


    }
}