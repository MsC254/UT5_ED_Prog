package vehiculos;

import vehiculos.tipos.TipoCoche;

public class Coche extends Vehiculo {
    private int numPuertas;
    protected TipoCoche tipo; // Protected para subclases

    public Coche(String matricula, String marca, String modelo, double precio, int numPuertas) {
        super(matricula, marca, modelo, precio);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.15; // Depreciación base para coches
    }
}