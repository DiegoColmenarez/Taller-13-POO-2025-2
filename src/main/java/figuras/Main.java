package figuras;

public class Main {
    public static void main(String[] args) {
        var triangulo1 = new Triangulo(12, 34);
        // var triangulo2 = new Triangulo(-21, 43);
        var rectangulo1 = new Rectangulo(13, 4);
       // var rectangulo2 = new Rectangulo(-32, 45);

        triangulo1.calcularArea();
        rectangulo1.calcularArea();

       // triangulo2.calcularArea();
        // rectangulo2.calcularArea();
    }
}