
package ejerciciossemana2poo;

public class TrianguloRectangulo {
    private double cateto1;
    private double cateto2;

    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    public double CalcularArea(){
        return (cateto1*cateto2)/ 2;
    }
    
    public double CalcularHipotenusa(){
        return Math.sqrt(Math.pow(cateto1, 2)*Math.pow(cateto1, 2));
    }
    
    public double CalcularPermitero(){
        return cateto1 + cateto2 + CalcularHipotenusa();
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    
    
    
}
