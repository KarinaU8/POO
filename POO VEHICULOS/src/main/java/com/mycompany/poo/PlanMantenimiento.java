package transporte_sur.clases;

public class PlanMantenimiento {
    private String codigoMantenimiento;
    private String datosDelTecnico;
    private String tipoMantenimiento;
    private String datosVehiculo;
    private int kilometraje;
    private String falla;
    private String fecha;
    private double costo;

    // Getters y Setters
    public String getCodigoMantenimiento() { return codigoMantenimiento; }
    public void setCodigoMantenimiento(String codigoMantenimiento) { this.codigoMantenimiento = codigoMantenimiento; }

    public String getDatosDelTecnico() { return datosDelTecnico; }
    public void setDatosDelTecnico(String datosDelTecnico) { this.datosDelTecnico = datosDelTecnico; }

    public String getTipoMantenimiento() { return tipoMantenimiento; }
    public void setTipoMantenimiento(String tipoMantenimiento) { this.tipoMantenimiento = tipoMantenimiento; }

    public String getDatosVehiculo() { return datosVehiculo; }
    public void setDatosVehiculo(String datosVehiculo) { this.datosVehiculo = datosVehiculo; }

    public int getKilometraje() { return kilometraje; }
    public void setKilometraje(int kilometraje) { this.kilometraje = kilometraje; }

    public String getFalla() { return falla; }
    public void setFalla(String falla) { this.falla = falla; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    @Override
    public String toString() {
        return codigoMantenimiento + " - " + tipoMantenimiento + " (" + fecha + ")";
    }

    public String toCsvString() {
        return codigoMantenimiento + ";" + datosDelTecnico + ";" + tipoMantenimiento + ";" + datosVehiculo + ";" + kilometraje + ";" + falla + ";" + fecha + ";" + costo;
    }
}
