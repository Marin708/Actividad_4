import javax.swing.JOptionPane;

public class Ejer_01 extends Base {
    public static void main(String[] args) {
        String Mnsj = "";
        int num1 = 0;
        int num2 = 0;

        Mnsj = ("Ingresar el primer número");
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));

        Mnsj = ("Ingresaar el segundo número");
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esMultiplo(num1, num2)) {
            Mnsj = num1 + " es multiplo de " + num2;
        } else {
            Mnsj = num1 + " no es multiplo de " + num2;
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
