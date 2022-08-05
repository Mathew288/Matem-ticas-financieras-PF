package clases;

import Vista.Principal;
import javax.swing.JFrame;

public class Funcionalidades {

    static Principal ventanaPrincipal = new Principal();

    public static double interesSimple(double capital, int tiempo,  double interes) {
        double resultado = (capital * (1 + ((interes / 100) * tiempo)));
        return resultado;
    }

    public static double interesCompuesto(double capital, int tiempo, double interes) {
        double resultado = (capital * Math.pow((1 + (interes / 100)), tiempo));
        return resultado;
    }

    public static void cerrarPrograma() {
        System.exit(0);
    }

    public static void regresarMenuPrincipal(JFrame ventanaCerrar) {
        ventanaCerrar.setVisible(false);
        ventanaPrincipal.setVisible(true);
    }

    public static double interesAPagar(double capital, double montoTotal) {
        return montoTotal - capital;
    }

        
}
