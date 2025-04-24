package vehiculos.tipos;

import vehiculos.Coche;

public class SUV extends Coche {
    private boolean traccion4x4;

    public SUV(String matricula, String marca, String modelo, double precio, int numPuertas) {
        super(matricula, marca, modelo, precio, numPuertas);
        this.tipo = TipoCoche.SUV;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.12;
    }
}