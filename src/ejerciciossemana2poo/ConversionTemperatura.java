
package ejerciciossemana2poo;

public class ConversionTemperatura {
    private double temCelcius;

    // Constructor
    public ConversionTemperatura(double temCelcius) {
        this.temCelcius = temCelcius;
    }

    public double convertirTemperatura() {
        return (temCelcius * 9 / 5) + 32;
    }

  
    public double getTemperaturaCelsius() {
        return temCelcius;
    }

    public void setTemperaturaCelsius(double temCelcius) {
        this.temCelcius = temCelcius;
    }
}
    
