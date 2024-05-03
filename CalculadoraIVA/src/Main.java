import javax.swing.*;

/*
Se tiene un producto, el cual puede o no tener IVA, para hacer el cálculo respectivo. Tomar en cuenta:
• Si el producto no tiene IVA, en ese caso el valor seria 0
• Los productos que tienen IVA si el valor es menor o igual a 500 es el 12%.
• Los productos que tienen IVA si es mayor a 500 y menor o igual a 1500 es el 14%.
• Los productos que tienen IVA si es mayor a 1500 es el 15%.
Diseñe los datos del producto que debería ingresar y determine el calculo respectivo.
 */
public class Main {
    public static void main(String[] args){
        float iva;
        float precio;

        JOptionPane.showMessageDialog(null, "Ingrese el precio del producto");
        precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio del producto"));

        if (precio <= 0) {
            JOptionPane.showMessageDialog(null, "El precio no puede ser menor o igual a 0");
            return;
        }
        if (precio <= 500) {
            iva = precio * 0.12f;
            JOptionPane.showMessageDialog(null, "El IVA es de: \n" + iva
                    + "\nEl precio total es de: \n" + (precio + iva));
        } else if (precio > 500 && precio <= 1500) {
            iva = precio * 0.14f;
            JOptionPane.showMessageDialog(null, "El IVA es de: \n" + iva
                    + "\nEl precio total es de: \n" + (precio + iva));
        } else {
            iva = precio * 0.15f;
            JOptionPane.showMessageDialog(null, "El IVA es de: \n" + iva
                    + "\nEl precio total es de: \n" + (precio + iva));
        }
    }
}