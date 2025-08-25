package com.mycompany.poo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String sexo;
    private String correo;
    private String celular;

    private static final String NOMBRE_ARCHIVO = "clientes.txt";

    public Cliente(String codigo, String nombres, String apellidos, String direccion, String sexo, String correo, String celular) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sexo = sexo;
        this.correo = correo;
        this.celular = celular;
    }

    public String getCodigo() {
        return codigo; 
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo; 
    }
    public String getNombres() {
        return nombres; 
    }
    public void setNombres(String nombres) {
        this.nombres = nombres; 
    }
    public String getApellidos() { 
        return apellidos; 
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos; 
    }
    public String getDireccion() {
        return direccion; 
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion; 
    }
    public String getSexo() {
        return sexo; 
    }
    public void setSexo(String sexo) {
        this.sexo = sexo; 
    }
    public String getCorreo() {
        return correo; 
    }
    public void setCorreo(String correo) { 
        this.correo = correo; 
    }
    public String getCelular() {
        return celular; 
    }
    public void setCelular(String celular) {
        this.celular = celular; 
    }
