
package ejerciciossemana2poo;

public class Producto{

    private String nombre;
    private double precioDeCosto;
    private double precioDeVenta;

    public Producto(String nombre, double precioDeCosto, double precioDeVenta) {
        this.nombre = nombre;
        this.precioDeCosto = precioDeCosto;
        this.precioDeVenta = precioDeVenta;
    }
    
    public double calcularGanancia() {
        return precioDeVenta - precioDeCosto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioDeCosto() {
        return precioDeCosto;
    }

    public void setPrecioDeCosto(double precioDeCosto) {
        this.precioDeCosto = precioDeCosto;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }   
}
