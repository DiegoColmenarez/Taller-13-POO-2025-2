package figuras;

public class Rectangulo extends Figuras {
    protected double largo;
    protected double ancho;
    public Rectangulo(double largo, double ancho){
        if (!(largo > 0) || !(ancho > 0)) {
            throw new RuntimeException("No se admiten numeros negativos.");
        } else {
            this.largo = largo;
            this.ancho = ancho;
        }
    }
    @Override
    void calcularArea() {
        double resultado = this.largo * this.ancho;
        System.out.println("El area del rectangulo es: " + resultado);
    }
}
