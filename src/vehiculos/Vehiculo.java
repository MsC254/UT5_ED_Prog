package vehiculos;

import interfaces.Valorable;
import personas.Persona;
import java.time.LocalDate;

public abstract class Vehiculo implements Valorable {
    private final String matricula;
    private String marca;
    private String modelo;
    protected double precio; // Protected para herencia
    private LocalDate fechaFabricacion;
    private Persona propietario;

    public Vehiculo(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Métodos comunes
    public double getPrecio() { return precio; }
    public String getMatricula() { return matricula; }

    // Método abstracto
    public abstract double calcularDepreciacion();

    // Implementación de la interfaz
    @Override
    public double calcularValorActual() {
        return precio - calcularDepreciacion();
    }
}