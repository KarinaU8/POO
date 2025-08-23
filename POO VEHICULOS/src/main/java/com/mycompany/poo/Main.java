package com.mycompany.poo;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Toyota", "Corolla", 2020);
        Cliente cliente = new Cliente("Karina Quispe", "12345678", "987654321");

        cliente.setVehiculo(carro);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Vehículo: " + cliente.getVehiculo().getMarca() + " " 
                           + cliente.getVehiculo().getModelo() + " " 
                           + cliente.getVehiculo().getAnio());

        cliente.getVehiculo().setModelo("Hilux");
        cliente.getVehiculo().setAnio(2023);

        System.out.println();
        System.out.println("Después de actualizar:");
        System.out.println("Vehículo: " + cliente.getVehiculo().getMarca() + " " 
                           + cliente.getVehiculo().getModelo() + " " 
                           + cliente.getVehiculo().getAnio());
    }
}
