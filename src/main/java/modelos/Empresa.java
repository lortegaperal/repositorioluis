package modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private int identificador;
    private String codigoempresa;
    private List<Empleado> empleados;
    private TipoEmpresa tipoempresa;

    public Empresa(int identificador, String codigoempresa, List<Empleado> empleados, TipoEmpresa tipoempresa) {
        this.identificador = identificador;
        this.codigoempresa = codigoempresa;
        this.empleados = empleados;
        this.tipoempresa = tipoempresa;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCodigoempresa() {
        return codigoempresa;
    }

    public void setCodigoempresa(String codigoempresa) {
        this.codigoempresa = codigoempresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public TipoEmpresa getTipoempresa() {
        return tipoempresa;
    }

    public void setTipoempresa(TipoEmpresa tipoempresa) {
        this.tipoempresa = tipoempresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return identificador == empresa.identificador && Objects.equals(codigoempresa, empresa.codigoempresa) && Objects.equals(empleados, empresa.empleados) && tipoempresa == empresa.tipoempresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoempresa, empleados, tipoempresa);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigoempresa='" + codigoempresa + '\'' +
                ", empleados=" + empleados +
                ", tipoempresa=" + tipoempresa +
                '}';
    }
}
