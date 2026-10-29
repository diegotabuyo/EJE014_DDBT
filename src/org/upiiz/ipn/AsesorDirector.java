package org.upiiz.ipn;

public class AsesorDirector extends Empleado {
    private float horasTrabajadas;
    private float precioPorHora;

    public AsesorDirector(String nombre, String claveEmpleado, String unidad) {
        super(nombre, claveEmpleado, unidad);
        horasTrabajadas = 0;
        precioPorHora = 0;
    }

    @Override
    public float calcularSalario() {
        return horasTrabajadas * precioPorHora;
    }

    @Override
    public float calcularSalarioAnual() {
        return calcularSalario() * 24 + getAguinaldo() + getBono();
    }

    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
}