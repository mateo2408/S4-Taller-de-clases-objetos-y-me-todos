import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float numero1, numero2;
        String operacion;

        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor 1: "));
        operacion = JOptionPane.showInputDialog("Digite la operacion: ");
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor 2: "));

        Calculadora cal1 = new Calculadora(numero1,numero2,operacion);
        JOptionPane.showMessageDialog(null, "El resultado es: " + cal1.resultado);
    }
}