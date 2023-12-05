import javax.swing.JOptionPane;

public class ejer_17 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        if (Funciones.esPrimo(num))
            mensaje = "el numero " + num + " si es primo ";
        else
            mensaje = "el numero " + num + " no es primo ";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
