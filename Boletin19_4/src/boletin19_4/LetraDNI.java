
package boletin19_4;

import javax.swing.JOptionPane;


public class LetraDNI {
    char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    public void calcularLetra(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu DNI: "));
        numero=numero%23;
        JOptionPane.showMessageDialog(null,"Tu letra es: "+letras[numero]);
    }
}
