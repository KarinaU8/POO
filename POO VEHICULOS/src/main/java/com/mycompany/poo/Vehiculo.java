package transporte_sur.clases;

public class Vehiculo {
    private String codigo;
    private String placa;
    private String numeroSerie;
    private int añoDeFabricacion;
    private String color;
    private int cantidadPuertas;
    private double cilindrada;
    private Cliente dueño;
    private PlanMantenimiento plan;

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public int getAñoDeFabricacion() { return añoDeFabricacion; }
    public void setAñoDeFabricacion(int añoDeFabricacion) { this.añoDeFabricacion = añoDeFabricacion; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getCantidadPuertas() { return cantidadPuertas; }
    public void setCantidadPuertas(int cantidadPuertas) { this.cantidadPuertas = cantidadPuertas; }

    public double getCilindrada() { return cilindrada; }
    public void setCilindrada(double cilindrada) { this.cilindrada = cilindrada; }

    public Cliente getDueño() { return dueño; }
    public void setDueño(Cliente dueño) { this.dueño = dueño; }

    public PlanMantenimiento getPlan() { return plan; }
    public void setPlan(PlanMantenimiento plan) { this.plan = plan; }

    @Override
    public String toString() {
        return placa + " (" + color + ") - Dueño: " + (dueño != null ? dueño.getNombres() : "Sin dueño");
    }

    public String toCsvString() {
        return codigo + ";" + placa + ";" + numeroSerie + ";" + añoDeFabricacion + ";" + color + ";" + cantidadPuertas + ";" + cilindrada + ";" + (dueño != null ? dueño.getCodigo() : "");
    }
}
