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

            if (empleado.getContrato().equals(tipoContrato)) {
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

    //COMPROBAR

    public double fondoSalarialEmpresa(Empresa empresa){
        int suma = 0;
        double salario = 0;
        for(Empleado empleado: empresa.getEmpleados()){
            suma += empleado.getContrato().getSalarioBase();
        }
        return suma;
    }


}
