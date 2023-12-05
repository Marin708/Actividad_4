import javax.swing.JOptionPane;

public class ejer_07 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int menor = 0;
        String Mnsj = "";

        Mnsj = ("Ingrese el primer número");
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = ("Ingrese el segundo numero");
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = ("Ahora veamos cual de los dos es menor");
        JOptionPane.showMessageDialog(null, Mnsj);
        menor = Funciones.menor(num1, num2);
        Mnsj = ("El número menor es: " + menor);
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
