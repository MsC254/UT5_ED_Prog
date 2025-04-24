package vehiculos.tipos;

import vehiculos.Coche;

public class Deportivo extends Coche {
    public Deportivo(String matricula, String marca, String modelo, double precio, int numPuertas) {
        super(matricula, marca, modelo, precio, numPuertas);
        this.tipo = TipoCoche.DEPORTIVO;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.20;
    }
}