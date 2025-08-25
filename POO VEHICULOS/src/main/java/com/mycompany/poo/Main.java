package com.mycompany.poo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PlanMantenimiento {
    private String codigoMantenimiento;
    private String datosDelTecnico;
    private String tipoMantenimiento;
    private String datosVehiculo;
    private int kilometraje;
    private String falla;
    private String fecha;
    private double costo;

    private static final String NOMBRE_ARCHIVO = "planes_mantenimiento.txt";

    public PlanMantenimiento(String codigoMantenimiento, String datosDelTecnico, String tipoMantenimiento,
                             String datosVehiculo, int kilometraje, String falla, String fecha, double costo) {
        this.codigoMantenimiento = codigoMantenimiento;
        this.datosDelTecnico = datosDelTecnico;
        this.tipoMantenimiento = tipoMantenimiento;
        this.datosVehiculo = datosVehiculo;
        this.kilometraje = kilometraje;
        this.falla = falla;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getCodigoMantenimiento() {
        return codigoMantenimiento;
    }
    public void setCodigoMantenimiento(String codigoMantenimiento) {
        this.codigoMantenimiento = codigoMantenimiento; 
    }

    public String getDatosDelTecnico() {
        return datosDelTecnico; 
    }
    public void setDatosDelTecnico(String datosDelTecnico) {
        this.datosDelTecnico = datosDelTecnico; 
    }

    public String getTipoMantenimiento() {
        return tipoMantenimiento;
    }
    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento; 
    }

    public String getDatosVehiculo() {
        return datosVehiculo; 
    }
    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo; 
    } 

    public int getKilometraje() {
        return kilometraje; 
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getFalla() { 
        return falla;
    }
    public void setFalla(String falla) {
        this.falla = falla; 
    }

    public String getFecha() {
        return fecha; 
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo; 
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
