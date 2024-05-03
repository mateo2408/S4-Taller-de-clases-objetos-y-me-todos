import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Se requiere tener un ejercicio para realizar el cálculo del área y perímetro de las figuras triangulo,
cuadrado y el rectángulo. Los datos deben ser ingresados utilizando el println y el BufferedReader.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lr = new BufferedReader(new InputStreamReader(System.in));
        int valor1, valor2;
        int eleccion;

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Escoja la figura de la cual desea calcular el area y perimetro");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        eleccion = Integer.parseInt(lr.readLine());
        switch (eleccion){
            case 1:
                System.out.println("Ingrese el valor del lado del cuadrado");
                valor1 = Integer.parseInt(lr.readLine());
                Cuadrado cuadrado = new Cuadrado(valor1);
                System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
                System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
                break;
            case 2:
                System.out.println("Ingrese el valor de la base del rectangulo");
                valor1 = Integer.parseInt(lr.readLine());
                System.out.println("Ingrese el valor de la altura del rectangulo");
                valor2 = Integer.parseInt(lr.readLine());
                Rectangulo rectangulo = new Rectangulo(valor1, valor2);
                System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
                System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triangulo");
                valor1 = Integer.parseInt(lr.readLine());
                System.out.println("Ingrese el valor de la altura del triangulo");
                valor2 = Integer.parseInt(lr.readLine());
                Triangulo triangulo = new Triangulo(valor1, valor2);
                System.out.println("El area del triangulo es: " + triangulo.calcularArea());
                System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
                break;

        }

    }
}