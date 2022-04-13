package Ejercicio1;

public class Circulo {
    protected double radio = 1.0;
    private String color = "rojo";

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }

    public double area(){
        return Math.PI*radio*radio;
    }

    @Override
    public String toString() {
        return "\nRadio: "+ radio +
                "\nArea: "+ this.area();
    }

}
