package boletin19_3;

import java.util.Scanner;

public class Boletin19_3 {

    public static void main(String[] args) {
        int opcion;
        int[] notas = new int[8];
        String[] alumnos = new String[8];
        Notas obx = new Notas();
        Alumno alumno = new Alumno();
        obx.crearArray(notas);
        alumno.crearArray(alumnos);

        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("Selecciona una opcion: "
                    + "\n1:amosar notas "
                    + "\n2:amosar aprobados "
                    + "\n3:amosar suspensos "
                    + "\n4:nota media "
                    + "\n5:nota mas alta"
                    + "\n6:amosar nota de un alumno por nombre:"
                    + "\n7:notas ordenadas"
                    + "\n8:amosar a nota dun alumno por posicion");
            System.out.println("");
            opcion = ler.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    obx.amosar(notas);
                    System.out.println("");
                    break;
                case 2:
                    obx.amosarAprobados(notas);
                    alumno.amosarAprobados(notas, alumnos);
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
                case 6:
                    String nome;
                    System.out.println("Indique el nombre del alumno: ");
                    nome = ler.nextLine();
                    nome = ler.nextLine();
                    alumno.amosarNota(notas, alumnos, nome);
                    break;
                case 7:
                    System.out.println("Notas ordenadas: ");
                    obx.ordenar(notas);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Indique a posicon: ");
                    int posicion = ler.nextInt();
                    alumno.amosarNota(notas, posicion);
                    System.out.println("");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);

    }

}
