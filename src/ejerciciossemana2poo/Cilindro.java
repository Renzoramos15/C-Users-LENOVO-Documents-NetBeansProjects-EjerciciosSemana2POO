package ejerciciossemana2poo;

abstract class figurageometrica {
    // Método abstracto para calcular el volumen (debe ser implementado por las subclases)
    abstract double calcularVolumen();
}

// Clase Cilindro que hereda de figurageometrica
class Cilindro extends figurageometrica {
    private double radio;
    private double altura;

   // Constructor
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    //  método abstracto
    @Override
    public double calcularVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    // Métodos getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}