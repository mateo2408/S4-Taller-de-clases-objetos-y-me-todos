public class Triangulo {
    int base, altura;
    Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int calcularArea(){
        return (base * altura) / 2;
    }
    public int calcularPerimetro(){
        return base * 3;
    }
}
