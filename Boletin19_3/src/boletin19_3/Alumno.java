package boletin19_3;

public class Alumno {

    public String[] crearArray(String[] array) {

        array[0]="David";
        array[1]="Ana";
        array[2]="Pedro";
        array[3]="Jaime";
        array[4]="Maria";
        array[5]="Cristina";
        array[6]="Carlos";
        array[7]="Begoña";
//System.out.println("tam:" + tam);
        return array;
    }

    public void amosarAprobados(int[] array, String[] arrai) {
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                cont++;
                System.out.println(arrai[i] + " ");
            }
        }

    }
    
    public void amosarNota(int[] array, String[] arrai, String nome){
        for (int i = 0; i<arrai.length;i++){
            if (arrai[i].equalsIgnoreCase(nome)) System.out.println("La nota de "+nome+" es: "+array[i]);
        }
    }
    
    public void amosarNota(int[] array, int posicion){
        
            System.out.println("La nota es: "+array[posicion-1]);
        
    }
    

}
