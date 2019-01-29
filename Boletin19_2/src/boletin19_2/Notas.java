package boletin19_2;

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
        System.out.println("APROBADOS: "+cont);
    }

    public void amosarSuspensos(int[] array) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5) {
                cont++;
               // System.out.print(array[i] + " ");
            }
        }
        System.out.println("SUSPENSOS: "+cont);
    }
    
    public int notaMedia(int[] array){
        int media=0;
            for (int i = 0; i < array.length; i++) {
                media=media+array[i];
            }
            
            return media/array.length;
    }
    
    public int notaAlta(int[] array){
        int alta=0;
            for (int i = 0; i < array.length; i++) {
                if (array[i]>alta) alta=array[i];
            }
    return alta;
    }

}
