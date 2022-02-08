package utilidades;

import modelos.Empleado;
import modelos.Empresa;
import modelos.Producto;
import modelos.TipoContrato;

import java.util.ArrayList;
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
        return empleados_mileuristas;

    }

}
