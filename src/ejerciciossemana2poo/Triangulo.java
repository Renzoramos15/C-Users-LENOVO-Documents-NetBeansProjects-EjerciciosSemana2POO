
package ejerciciossemana2poo;


public class Triangulo {
    //Definir variables
    private double base;
    private double altura;
    
    //Constructor
    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double CalcularArea(){
        return (base*altura)/2;
    }
    
   //Getter and Setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
