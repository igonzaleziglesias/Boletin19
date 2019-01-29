package boletin19_3;

public class Notas {

    public int[] crearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }
        //System.out.println("tam:" + tam);
        return array;
    }

    public void amosar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void amosarAprobados(int[] array) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                cont++;
                //System.out.print(array[i] + " ");
            }
        }
        System.out.println("APROBADOS: " + cont);
    }

    public void amosarSuspensos(int[] array) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                cont++;
                // System.out.print(array[i] + " ");
            }
        }
        System.out.println("SUSPENSOS: " + cont);
    }

    public int notaMedia(int[] array) {
        int media = 0;
        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }

        return media / array.length;
    }

    public int notaAlta(int[] array) {
        int alta = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > alta) {
                alta = array[i];
            }
        }
        return alta;
    }

    public void ordenar(int[] array) {
        int aux;

        int[] arrai = new int[array.length];

        for (int i = 0; i < arrai.length; i++) {
            arrai[i] = array[i];
        }
        for (int i = 0; i < arrai.length - 1; i++) {
            for (int j = i + 1; j < arrai.length; j++) {
                if (arrai[i] > arrai[j]) {
                    aux = arrai[i];
                    arrai[i] = arrai[j];
                    arrai[j] = aux;

                }
            }

        }
        for (int i = 0; i < arrai.length; i++) {
            System.out.print(arrai[i] + " ");
        }
        System.out.println("");
    }

}
