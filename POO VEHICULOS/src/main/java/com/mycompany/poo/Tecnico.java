package transporte_sur.clases;

public class Tecnico {
    private String codigo;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String sexo;
    private String correo;
    private String celular;
    private String especialidad;
    private int tiempoServicio;

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getTiempoServicio() { return tiempoServicio; }
    public void setTiempoServicio(int tiempoServicio) { this.tiempoServicio = tiempoServicio; }

    @Override
    public String toString() {
        return codigo + " - " + nombres + " " + apellidos + " (" + especialidad + ")";
    }

    public String toCsvString() {
        return codigo + ";" + nombres + ";" + apellidos + ";" + direccion + ";" + sexo + ";" + correo + ";" + celular + ";" + especialidad + ";" + tiempoServicio;
    }
}
