package utilidades;

import modelos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilidadesEmpresa {
    public List<Empleado> getEmpleadosPorContrato(Empresa empresa, TipoContrato tipoContrato){
        List<Empleado> empleados_contrato = new ArrayList<>();

        for(Empleado empleado : empresa.getEmpleados()) {

            if (empleado.getContrato().getTipocontrato().equals(tipoContrato)) {
                 empleados_contrato.add(empleado);
            }
        }
        return empleados_contrato;
    }
    public List<Empleado> getMileuristasOrdenadosPorSalario(Empresa empresa){
        List<Empleado> empleados_mileuristas = new ArrayList<>();
        for (Empleado empleado : empresa.getEmpleados()) {

            if (empleado.getContrato().getSalarioBase() >= 1000){
                empleados_mileuristas.add(empleado);
            }
        }
        empleados_mileuristas.sort(Comparator.comparing(e-> e.getContrato().getSalarioBase(), Collections.reverseOrder()));
        return empleados_mileuristas;

    }


    public double fondoSalarialEmpresa(Empresa empresa){
        int suma = 0;

        for(Empleado empleado: empresa.getEmpleados()){

            suma += empleado.getContrato().getSalarioBase();
        }

        return suma;
    }

//CON LOS EMPLEADOS MEJOR
    public Empleado getMejorPagado(List<Empresa> empresas){
        for (Empresa empresa: empresas){
            for (Empleado empleado: empresa.getEmpleados()){
               double salario = empleado.getContrato().getSalarioBase();
                if (empleado.getContrato().getSalarioBase() > salario){
                    double salario_max = empleado.getContrato().getSalarioBase();
                }

            }
        }
    }
}
