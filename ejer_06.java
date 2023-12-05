import javax.swing.JOptionPane;

public class ejer_06 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int mayor = 0;
        String Mnsj = "";

        Mnsj = ("Ingrese el primer número");
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = ("Ingrese el segundo numero");
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = ("Ahora veamos cual de los dos es mayor");
        JOptionPane.showMessageDialog(null, Mnsj);
        mayor = Funciones.mayor(num1, num2);
        Mnsj = ("El número mayor es: " + mayor);
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
