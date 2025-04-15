
package ejerciciossemana2poo;

public class EjerciciosSemana2POO {

    public static void main(String[] args){
        
        //ESTUDIANTE: RAMOS DIAZ RENZO FERNANDO 
        
        Triangulo t = new Triangulo (3,7);
        System.out.println("Esto es un mensaje nuevo");
        System.out.println("------------------ EJERCICIO Nº 1 ------------------");
        System.out.println("El area del triangulo es:" + t.CalcularArea());
        
        
        Numero n = new Numero (5);
        System.out.println("------------------ EJERCICIO Nº 2 ------------------");
        System.out.println("El número al cuadrado es: " + n.CalcularCuadrado());
        System.out.println("El número al cubo es: " + n.CalcularCubo());
         
        
        Cilindro c = new Cilindro(5, 10);
        System.out.println("------------------ EJERCICIO Nº 3 ------------------");
        System.out.println("Volumen del cilindro: " + c.calcularVolumen() + " unidades cúbicas");
        
        
        TrianguloRectangulo tr = new TrianguloRectangulo (5, 3);
         System.out.println("------------------ EJERCICIO Nº 4 ------------------");
         System.out.println("El area del triangulo rectangulo es de: " + tr.CalcularArea());
         System.out.println("La hipotenusa del triangulo rectangulo es de: " + tr.CalcularHipotenusa());
         System.out.println("El perímetro del triangulo rectangulo es de: " + tr.CalcularPermitero());
        
         
        ConversionTemperatura ct = new ConversionTemperatura (38);
        System.out.println("------------------ EJERCICIO Nº 5 ------------------");
        System.out.println("Temperatura en °C: " + ct.getTemperaturaCelsius());
        System.out.println("Temperatura de ºC en °F : " + + ct.convertirTemperatura());
        
        
        ConversionLongitud cl = new ConversionLongitud(15);
        System.out.println("------------------ EJERCICIO Nº 6 ------------------");
        System.out.println("La conversión de metros a pies es: " + cl.convertirAPies() + " pies");
        System.out.println("La conversión de metros a pulgadas es: " + cl.convertirAPulgadas() + " pulgadas");

        
        
        Producto p = new Producto("Caja de cuadernos", 50, 85);
        System.out.println("------------------ EJERCICIO Nº 7 ------------------");
        System.out.println("Producto: " +p.getNombre());
        System.out.println("La ganancia del producto es: " + p.calcularGanancia());
        
        
        Trabajador trb = new Trabajador ("Jefferson", 20.5, 40);
        System.out.println("------------------ EJERCICIO Nº 8 ------------------");
        System.out.println("Nombre del trabajador: " + trb.getNombre());
        System.out.println("El salario bruto del trabajador es: S/" + trb.CalcularSalarioBruto());
        System.out.println("El impuesto del trabajador es: S/" + trb.CalcularImpuesto());
        System.out.println("El salario neto del trabajador es: S/" + trb.CalcularSalarioNeto());

       
        //Polimorfismo sobrecarga
        GasIdeal g = new GasIdeal (98, 2, 10);
        System.out.println("------------------ EJERCICIO Nº 9 ------------------");
        System.out.println("La presión es (Parametros1): " + g.calcularPresion() + " atm");
        System.out.println("La presión es (parámetros2): " + g.calcularPresion(210, 1.5, 8) + " atm");
        
        
        System.out.println("------------------ EJERCICIO Nº 10 ------------------");
        Movil m = new Movil (10,3,5);
        System.out.println("El espacio recorrido del Movil es de: " + m.calcularEspacio() + " metros ");
        
    }
}

