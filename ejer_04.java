import javax.swing.JOptionPane;

public class ejer_04 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = ("Ingresar un número para determinar si es positivo");
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esPositivo(num)) {
            Mnsj = "El número es positivo";
        } else {
            Mnsj = "El número no es positivo";
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
