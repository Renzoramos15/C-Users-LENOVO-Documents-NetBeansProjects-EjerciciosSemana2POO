
package ejerciciossemana2poo;

public class Trabajador {
    private String Nombre;
    private double PrecioHora;
    private int HorasTrabajadas; //devuelve entero

    public Trabajador(String Nombre, double PrecioHora, int HorasTrabajadas) {
        this.Nombre = Nombre;
        this.PrecioHora = PrecioHora;
        this.HorasTrabajadas = HorasTrabajadas;
    }


    public double CalcularSalarioBruto(){
        return PrecioHora * HorasTrabajadas;
    }
    
    public double CalcularImpuesto(){
        return CalcularSalarioBruto() * 0.10;
    }
    
    public double CalcularSalarioNeto(){
        return CalcularSalarioBruto() - CalcularImpuesto();
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(double PrecioHora) {
        this.PrecioHora = PrecioHora;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }
    
    
    
}
