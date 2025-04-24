package vehiculos.tipos;

import vehiculos.Moto;

public class MotoDeportiva extends Moto {
    public MotoDeportiva(String matricula, String marca, String modelo, double precio, int cilindrada) {
        super(matricula, marca, modelo, precio, cilindrada);
        this.tipo = TipoMoto.DEPORTIVA;
    }

    @Override
    public double calcularDepreciacion() {
        return precio * (cilindrada > 600 ? 0.18 : 0.12);
    }
}