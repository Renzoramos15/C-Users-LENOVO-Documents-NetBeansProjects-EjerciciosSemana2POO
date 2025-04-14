package ejerciciossemana2poo;

class ConversionLongitud {
  private double CantidadMetros;

    public ConversionLongitud(double CantidadMetros) {
        this.CantidadMetros = CantidadMetros;
    }
    
    public double convertirAPies() {
        return CantidadMetros * 3.28084;
    }

    public double convertirAPulgadas() {
        return CantidadMetros * 39.3701;
    }
    //Getter and Setter
    public double getCantidadMetros() {
        return CantidadMetros;
    }

    public void setCantidadMetros(double CantidadMetros) {
        this.CantidadMetros = CantidadMetros;
    }
    
}



