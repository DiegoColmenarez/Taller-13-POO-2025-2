package figuras;

public class Triangulo extends Figuras{
    protected double base;
    protected double altura;
    public Triangulo(double base, double altura){
        if (!(base > 0) || !(altura > 0)) {
            throw new RuntimeException("No se admiten numeros negativos.");
        } else {
            this.base = base;
            this.altura = altura;
        }
    }
    @Override
    void calcularArea() {
       double resultado = (this.base * this.altura) * 0.5;
        System.out.println("El area del triangulo es: " + resultado);
    }
}
