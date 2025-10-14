package patos;

public class Pato implements Nadador, Volador{
    @Override
    public void nadar(){
        System.out.println("El pato nada.");
    }
    @Override
    public void volar() {
        System.out.println("El pato vuela.");
    }
}
