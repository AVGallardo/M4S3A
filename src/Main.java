import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int i = 1;
        int cont = 1;
        int contAux;

        System.out.println("Favor ingrese un numero");
        number = sc.nextInt();
        while (i <= number ) {
            System.out.print((i % 2 == 0) ? "." : "*");
            i++;
        }

        while (cont <= number) {
            contAux = 1;
            while (contAux <= number) {
                if ( contAux == 1 ) {
                    System.out.println();
                }
                if ( cont == 1  || cont == number) {
                    System.out.print("*");
                } else if ( contAux == 1  || contAux == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                contAux++;
            }
            cont++;
        }

        for (int row = 1; row <= number; row++) {
            System.out.println();
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}