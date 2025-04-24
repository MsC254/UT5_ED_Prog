package vehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String matricula, String marca, String modelo, double precio, double capacidadCarga) {
        super(matricula, marca, modelo, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.20; // Depreciación base para camiones
    }
}