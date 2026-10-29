package org.upiiz.ipn;

//Diego Daniel Becerra Tabuyo 3IM1

public class Main {
    public static void main(String[] args) {
        // Docente
        Docente docente1 = new Docente("Luis", "147898", "Zacatecas", "Programación");
        docente1.setPrecioPorHora(200);
        docente1.setHorasTrabajadas(80);
        docente1.mostrarInformacion();
        docente1.setBono(5000);
        docente1.setAguinaldo(20000);
        System.out.println("Salario anual: " + docente1.calcularSalarioAnual());

        // Director
        Director director1 = new Director("Marta", "258963", "Zacatecas", "2026-2027");
        director1.setSueldoBase(15000);
        director1.mostrarInformacion();
        director1.setBono(5000);
        director1.setAguinaldo(20000);
        System.out.println("Salario anual: " + director1.calcularSalarioAnual());

        // AsesorDirector
        AsesorDirector asesor1 = new AsesorDirector("Pedro", "369741", "Zacatecas");
        asesor1.setPrecioPorHora(150);
        asesor1.setHorasTrabajadas(60);
        asesor1.mostrarInformacion();
        asesor1.setBono(2000);
        asesor1.setAguinaldo(10000);
        System.out.println("Salario anual: " + asesor1.calcularSalarioAnual());

        // AsistenteDirector
        AsistenteDirector asistente1 = new AsistenteDirector("Sofia", "741852", "Zacatecas");
        asistente1.setPrecioPorHora(120);
        asistente1.setHorasTrabajadas(50);
        asistente1.mostrarInformacion();
        asistente1.setBono(1500);
        asistente1.setAguinaldo(8000);
        System.out.println("Salario anual: " + asistente1.calcularSalarioAnual());
    }
}