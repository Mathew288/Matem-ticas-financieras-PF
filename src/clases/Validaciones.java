package clases;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Validaciones {

    /*Valida que el usuario no escriba letras donde tienen que ir números*/
    public static void validarANumeros(java.awt.event.KeyEvent evt) {
        char caracter;
        caracter = evt.getKeyChar();

        if (Character.isLetter(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Error: No se permiten letras", "",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    /*Valida que el usuario no escriba números donde tienen que ir letras.*/   
    public static void validarALetras(java.awt.event.KeyEvent evt) {
        char caracter;
        caracter = evt.getKeyChar();

        if (!Character.isLetter(caracter)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Error: No se permiten números", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
       /*Estos tres métodos verifican si los campos JTextField están vacios, y según eso
    activa o desactiva el botón que depende de estos campos.*/
    public static void estaVacioElCampo(JTextField campo1, JButton boton) {
        if (campo1.getText().isEmpty()) {
            boton.setEnabled(false);
        } else {
            boton.setEnabled(true);
        }
    }
    public static void estaVacioElCampo(JTextField campo1, JTextField campo2, JButton boton) {
        if (campo1.getText().isEmpty() || campo2.getText().isEmpty()) {
            boton.setEnabled(false);
        } else {
            boton.setEnabled(true);
        }
    }
    public static void estaVacioElCampo(JTextField campo1, JTextField campo2, JTextField campo3,
            JButton boton) {
        if (campo1.getText().isEmpty() || campo2.getText().isEmpty() || campo3.getText().isEmpty()){
            boton.setEnabled(false);
        } else {
            boton.setEnabled(true);
        }
    }

}
