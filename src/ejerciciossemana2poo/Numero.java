package ejerciciossemana2poo;

public class Numero {
    private double NumeroReal;

    public Numero(double NumeroReal){
        this.NumeroReal= NumeroReal;
    }
    
    public double CalcularCuadrado(){
        return Math.pow(NumeroReal, 2);
    }
    
    public double CalcularCubo(){
        return Math.pow(NumeroReal, 3);
    }

    public double getNumeroReal() {
        return NumeroReal;
    }

    public void setNumeroReal(double NumeroReal) {
        this.NumeroReal = NumeroReal;
    }   
}
