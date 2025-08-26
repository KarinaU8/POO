package transporte_sur.clases;

public class PlanMantenimiento {
    private String codigoMantenimiento;
    private String tipoMantenimiento;
    private int kilometraje;
    private String falla;
    private String fecha;
    private double costo;
    private Tecnico tecnico;
    private Vehiculo vehiculo;

    public String getCodigoMantenimiento() { return codigoMantenimiento; }
    public void setCodigoMantenimiento(String codigoMantenimiento) { this.codigoMantenimiento = codigoMantenimiento; }

    public String getTipoMantenimiento() { return tipoMantenimiento; }
    public void setTipoMantenimiento(String tipoMantenimiento) { this.tipoMantenimiento = tipoMantenimiento; }

    public int getKilometraje() { return kilometraje; }
    public void setKilometraje(int kilometraje) { this.kilometraje = kilometraje; }

    public String getFalla() { return falla; }
    public void setFalla(String falla) { this.falla = falla; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public Tecnico getTecnico() { return tecnico; }
    public void setTecnico(Tecnico tecnico) { this.tecnico = tecnico; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    @Override
    public String toString() {
        return codigoMantenimiento + " - " + tipoMantenimiento + " (" + fecha + ") - Técnico: " + (tecnico != null ? tecnico.getNombres() : "N/A");
    }

    public String toCsvString() {
        return codigoMantenimiento + ";" + (tecnico != null ? tecnico.getCodigo() : "") + ";" + tipoMantenimiento + ";" + (vehiculo != null ? vehiculo.getCodigo() : "") + ";" + kilometraje + ";" + falla + ";" + fecha + ";" + costo;
    }
}
