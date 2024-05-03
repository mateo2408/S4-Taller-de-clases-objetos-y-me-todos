public class Calculadora {

    float Num1;
    float Num2, resultado;
    String operador;

    public Calculadora(float Num1, float Num2, String Operador){
        this.Num1 = Num1;
        this.Num2 = Num2;

        if (Operador.equals("+"))
        {
            resultado = this.Num1 + this.Num2;
        }
        else {
            if (Operador.equals("-"))
            {
                resultado = this.Num1 - this.Num2;
            }
            else {
                if (Operador.equals("*"))
                {
                    resultado = this.Num1 * this.Num2;
                }
                else {
                    if (Operador.equals("/"))
                    {
                        resultado = this.Num1 / this.Num2;
                    }
                }
            }
        }
    }
}
