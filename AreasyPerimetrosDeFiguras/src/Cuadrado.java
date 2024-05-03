public class Cuadrado {
    int lado;
    Main main = new Main();
    Cuadrado(int lado){
        this.lado = lado;
    }
    public int calcularArea(){
        return lado * lado;
    }
    public int calcularPerimetro(){
        return lado * 4;
    }
}
