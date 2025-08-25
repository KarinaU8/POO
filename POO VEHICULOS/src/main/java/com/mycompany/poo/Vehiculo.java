package com.mycompany.poo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {

    private String codigo;
    private String placa;
    private String numeroSerie;
    private int añoDeFabricacion;
    private String color;
    private int cantidadPuertas;
    private double cilindrada;
    private String dueño;
    
    private static final String NOMBRE_ARCHIVO = "vehiculos.txt";

    public Vehiculo(String codigo, String placa, String numeroSerie, int añoDeFabricacion, String color, int cantidadPuertas, double cilindrada, String dueño) {
        this.codigo = codigo;
        this.placa = placa;
        this.numeroSerie = numeroSerie;
        this.añoDeFabricacion = añoDeFabricacion;
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
        this.cilindrada = cilindrada;
        this.dueño = dueño;
    }

    public String getCodigo() {
        return codigo; 
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo; 
    }

    public String getPlaca() {
        return placa; 
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroSerie() {
        return numeroSerie; 
    }
    public void setNumeroSerie(String numeroSerie) { 
        this.numeroSerie = numeroSerie; 
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }
    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion; 
    }

    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }

    public int getCantidadPuertas() {
        return cantidadPuertas; 
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas; 
    }

    public double getCilindrada() {
        return cilindrada; 
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada; 
    }

    public String getDueño() {
        return dueño; 
    }
    public void setDueño(String dueño) {
        this.dueño = dueño; 
    }
