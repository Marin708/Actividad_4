import javax.swing.JOptionPane;

public class ejer_05 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = ("Ingresar un número para determinar si es negativo");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esNegativo(num)) {
            Mnsj = "El número es negativo";
        } else {
            Mnsj = "El número no es negativo";
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
