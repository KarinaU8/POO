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

        System.out.println(cliente);
        System.out.println(vehiculo);
    }
}
