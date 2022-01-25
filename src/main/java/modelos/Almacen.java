package modelos;

import java.util.Objects;

public class Almacen {

    @Override
    public String toString() {
        return "Almacen{" +
                "identificador=" + identificador +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    private int identificador;
    private String nombre;
    private int capacidad;

    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
}

