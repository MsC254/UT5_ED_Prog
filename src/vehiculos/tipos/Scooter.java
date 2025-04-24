package vehiculos.tipos;

import vehiculos.Moto;

public class Scooter extends Moto {
    public Scooter(String matricula, String marca, String modelo, double precio, int cilindrada) {
        super(matricula, marca, modelo, precio, cilindrada);
        this.tipo = TipoMoto.SCOOTER;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * 0.08;
    }
}