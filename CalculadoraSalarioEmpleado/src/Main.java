import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/*
Se construirá una aplicación que ingrese los datos un empleado: cedula, nombre, apellido, genero,
salario, fecha de nacimiento y fecha de ingreso. La aplicación debe permitir que se modifique su salario
y que se calcule su edad y sus prestaciones. Para calcular las prestaciones se utilizar la formular p = (a
* s)/12 (p: prestaciones, a: antigüedad, s: salario).
Requerimientos funcionales de la aplicación:
• Ingresar datos del empleado
• Modificar salario
• Calcular edad
• Calcular prestaciones
 */
public class Main {
    public static void main(String[] args) {
        int cedula;
        float salario;
        String nombre, apellido, genero;

        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado"));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado");
        genero = JOptionPane.showInputDialog("Ingrese el genero del empleado(M/F)");
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del empleado DD/MM/AAAA"), formatter);
        LocalDate fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de ingreso del empleado DD/MM/AAAA"), formatter);

        int edad = LocalDate.now().getYear() - fechaNacimiento.getYear();
        int antiguedad = LocalDate.now().getYear() - fechaIngreso.getYear();

        float prestaciones = (antiguedad * salario) / 12;

        if (genero.equals("M") || genero.equals("m")) {
            genero = "Masculino";
        } else if (genero.equals("F") || genero.equals("f")) {
            genero = "Femenino";
        } else {
            genero = "Genero no valido";
        }

        JOptionPane.showMessageDialog(null, "La cedula del empleado es: " + cedula +
                "\n" + "El nombre del empleado es: "+nombre +
                "\n" + "El apellido del empleado es: " + apellido +
                "\n" + "El genero del empleado es: " + genero +
                "\n" + "El salario del empleado es: " + salario +
                "\n" + "La edad del empleado es: " + edad +
                "\n" + "La fecha de nacimiento del empleado es: " + fechaNacimiento +
                "\n" + "La fecha de ingreso del empleado es: " + fechaIngreso +
                "\n" + "La antiguedad del empleado es: " + antiguedad +
                "\n" + "Las prestaciones del empleado son: " + prestaciones);

        if ("si".equals(JOptionPane.showInputDialog("Desea modificar el salario del empleado? si/no"))) {
            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo salario del empleado"));
        }

        JOptionPane.showMessageDialog(null, "La cedula del empleado es: " + cedula +
                "\n" + "El nombre del empleado es: "+nombre +
                "\n" + "El apellido del empleado es: " + apellido +
                "\n" + "El genero del empleado es: " + genero +
                "\n" + "El salario del empleado es: " + salario +
                "\n" + "La edad del empleado es: " + edad +
                "\n" + "La fecha de nacimiento del empleado es: " + fechaNacimiento +
                "\n" + "La fecha de ingreso del empleado es: " + fechaIngreso +
                "\n" + "La antiguedad del empleado es: " + antiguedad +
                "\n" + "Las prestaciones del empleado son: " + prestaciones);
        
    }
}