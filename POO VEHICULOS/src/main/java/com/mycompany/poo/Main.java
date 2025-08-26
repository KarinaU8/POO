package transporte_sur;

import transporte_sur.clases.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCodigo("C001");
        cliente.setNombres("Juan");
        cliente.setApellidos("Perez");

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setCodigo("V001");
        vehiculo.setPlaca("ABC-123");
        vehiculo.setColor("Rojo");
        vehiculo.setDueño(cliente);
        cliente.addVehiculo(vehiculo);

        Tecnico tecnico = new Tecnico();
        tecnico.setCodigo("T001");
        tecnico.setNombres("Carlos");
        tecnico.setApellidos("Gomez");
        tecnico.setEspecialidad("Mecánica General");

        PlanMantenimiento plan = new PlanMantenimiento();
        plan.setCodigoMantenimiento("M001");
        plan.setTipoMantenimiento("Cambio de aceite");
        plan.setFecha("2025-08-25");
        plan.setKilometraje(15000);
        plan.setCosto(120.50);
        plan.setTecnico(tecnico);
        plan.setVehiculo(vehiculo);
        vehiculo.setPlan(plan);
        tecnico.addPlan(plan);

        System.out.println(cliente);
        System.out.println(vehiculo);
        System.out.println(plan);
    }
}
