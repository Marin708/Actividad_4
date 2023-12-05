import javax.swing.JOptionPane;

public class Ejer_03 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = ("Ingresar el número para saber si es impar");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esImpar(num)) {
            Mnsj = "El número es impar";
        } else {
            Mnsj = "El número no es impar";
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
