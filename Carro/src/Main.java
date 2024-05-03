import javax.swing.*;

/*
Se tiene un vehículo y se requiere saber cuántos kilómetros ha recorrido y mostrar la información de
este. Para esto se debe ingresar:
- Numero de motor
- Numero de ventanas
- La cantidad de puertas
- Marca
- Modelo
- Kilometraje inicial
- Kilometraje final
Se debe presentar la información de los datos ingresados y el cálculo de los kilómetros recorridos.
Utilizar el JOptionPane.
 */
public class Main {
    public static void main(String[] args) {
        String motor, ventanas, puertas, marca, modelo, kilometrajeInicial, kilometrajeFinal;
        JOptionPane.showMessageDialog(null, "Ingrese los datos del vehículo");
        motor = JOptionPane.showInputDialog("Ingrese el número de motor");
        ventanas = JOptionPane.showInputDialog("Ingrese el número de ventanas");
        puertas = JOptionPane.showInputDialog("Ingrese la cantidad de puertas");
        marca = JOptionPane.showInputDialog("Ingrese la marca");
        modelo = JOptionPane.showInputDialog("Ingrese el modelo");
        kilometrajeInicial = JOptionPane.showInputDialog("Ingrese el kilometraje inicial");
        kilometrajeFinal = JOptionPane.showInputDialog("Ingrese el kilometraje final");

        JOptionPane.showMessageDialog(null, "Número de motor: " + motor + "\n" +
                "Número de ventanas: " + ventanas + "\n" +
                "Cantidad de puertas: " + puertas + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Kilometraje inicial: " + kilometrajeInicial + "\n" +
                "Kilometraje final: " + kilometrajeFinal + "\n" +
                "Kilometraje recorrido: " + (Integer.parseInt(kilometrajeFinal) - Integer.parseInt(kilometrajeInicial)));
    }
}