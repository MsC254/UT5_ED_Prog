package personas;

import java.time.LocalDate;

public class Persona {
    private final String dni;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String dni, String nombre) {
        if (!validarDNI(dni)) throw new IllegalArgumentException("DNI inválido");
        this.dni = dni;
        this.nombre = nombre;
    }

    private boolean validarDNI(String dni) {
        return dni.matches("^\\d{8}[A-Za-z]$");
    }

    // Getters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
}