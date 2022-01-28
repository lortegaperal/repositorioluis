package modelos;

import java.util.Objects;

public class Cliente {



    private int identificador;
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private TipoCliente tcliente;


    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }


    public TipoCliente getTcliente(){
        return tcliente;
    }
    public void setTcliente(TipoCliente tcliente) {
        this.tcliente = tcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificador=" + identificador +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tcliente=" + tcliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return identificador == cliente.identificador && Objects.equals(dni, cliente.dni) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellidos, cliente.apellidos) && Objects.equals(direccion, cliente.direccion) && tcliente == cliente.tcliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, dni, nombre, apellidos, direccion, tcliente);
    }
}
