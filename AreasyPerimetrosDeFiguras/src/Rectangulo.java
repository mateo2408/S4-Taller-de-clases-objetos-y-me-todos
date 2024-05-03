public class Rectangulo {
    int base, altura;
    Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public int calcularArea(){
        return base * altura;
    }
    public int calcularPerimetro(){
        return (base * 2) + (altura * 2);
    }
}
