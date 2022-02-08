package modelos;

import java.util.Objects;

public class Contrato {
    private int identificador;
    private double salarioBase;
    private TipoContrato tipocontrato;

    public Contrato(int identificador, double salarioBase, TipoContrato tipocontrato) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
        this.tipocontrato = tipocontrato;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public TipoContrato getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(TipoContrato tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return identificador == contrato.identificador && Double.compare(contrato.salarioBase, salarioBase) == 0 && tipocontrato == contrato.tipocontrato;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase, tipocontrato);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                ", tipocontrato=" + tipocontrato +
                '}';
    }
}


