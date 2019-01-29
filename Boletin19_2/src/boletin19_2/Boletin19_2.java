package boletin19_2;

import java.util.Scanner;

public class Boletin19_2 {

    public static void main(String[] args) {
        int opcion;
        int[] notas = new int[30];
        Notas obx = new Notas();
        obx.crearArray(notas);

        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Selecciona una opcion: \n1:amosar notas \n2:amosar aprobados \n3:amosar suspensos \n4:nota media \n5:nota mas alta");
            opcion = ler.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    obx.amosar(notas);
                    System.out.println("");
                    break;
                case 2:
                    obx.amosarAprobados(notas);
                    System.out.println("");
                    break;
                case 3:
                    obx.amosarSuspensos(notas);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("La nota media de la clase es: " + obx.notaMedia(notas));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("La nota mas alta fue: " + obx.notaAlta(notas));
                    System.out.println("");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);

    }

}
