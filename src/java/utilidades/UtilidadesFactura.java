package utilidades;

import modelos.Factura;
import modelos.LineaFactura;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UtilidadesFactura {

    public boolean esFacturaVencida(Factura factura){

        if(factura.getFechaVencimiento().isAfter(LocalDate.now())){
            return true;
        } else {
            return false;
        }
    }
    public double calcularBaseFactura(Factura factura){


        }


    }

}
