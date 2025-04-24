package vehiculos;

import vehiculos.tipos.TipoMoto;

public class Moto extends Vehiculo {
    protected int cilindrada; // Protected para subclases
    protected TipoMoto tipo;

    public Moto(String matricula, String marca, String modelo, double precio, int cilindrada) {
        super(matricula, marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.10; // Depreciación base para motos
    }
}