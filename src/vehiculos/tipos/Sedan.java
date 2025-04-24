package vehiculos.tipos;

import vehiculos.Coche;

public class Sedan extends Coche {
    public Sedan(String matricula, String marca, String modelo, double precio, int numPuertas) {
        super(matricula, marca, modelo, precio, numPuertas);
        this.tipo = TipoCoche.SEDAN;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.10;
    }
}