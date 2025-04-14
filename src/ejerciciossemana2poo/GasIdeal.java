
package ejerciciossemana2poo;

public class GasIdeal {
    private double temperatura; 
    private double numeroDeMoles;
    private double volumen;
    //R = 0.0821;


    public GasIdeal(double temperatura, double numeroDeMoles, double volumen) {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }

    // Método 1: calcular presión con atributos internos
    public double calcularPresion() {
        return (numeroDeMoles * 0.0821 * temperatura) / volumen;
    }

    // Método 2 (sobrecargado): calcular presión con parámetros externos
    public double calcularPresion(double temperatura, double numeroDeMoles, double volumen) {
        return (numeroDeMoles * 0.0821 * temperatura) / volumen;
    }

 
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getNumeroDeMoles() {
        return numeroDeMoles;
    }

    public void setNumeroDeMoles(double numeroDeMoles) {
        this.numeroDeMoles = numeroDeMoles;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
