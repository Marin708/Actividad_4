import javax.swing.JOptionPane;

public class ejer_09 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int doblefactorial = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        doblefactorial = Funciones.dobleFactorial(num);
        mensaje = "El doble factorial de este numero es: " + doblefactorial;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
