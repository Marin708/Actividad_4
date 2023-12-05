import javax.swing.JOptionPane;

public class ejer_11 {
    public static void main(String[] args) {
        String mensaje = "";
        int num = 0;
        int cantdivisoresneg = 0;

        mensaje = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
        cantdivisoresneg = Funciones.cantDivisoresNeg(num);
        mensaje = "La cantidad de divisores negativos de este numero son: " + cantdivisoresneg;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
