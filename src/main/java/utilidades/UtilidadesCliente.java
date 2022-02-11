package utilidades;

import modelos.Cliente;

import javax.swing.text.StringContent;

public class UtilidadesCliente {
    public boolean esDniValido(Cliente cliente){

        if (cliente.getDni().length() == 9 && cliente.getDni().matches("^[1-9]{8}[A-Z]{1}$")){
            return true;

        }else {
            return false;
        }
    }

}
