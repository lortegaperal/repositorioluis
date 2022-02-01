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
        double total = 0.0;

        for( LineaFactura lin : factura.getLineaFactura()){
            total += lin.getProducto().getPrecio() * lin.getCantidad();
        }
        return total;

    }
    public double calcularTotalAPagar(Factura factura){

        double TotalAPagar = (factura.getImporteBase() - factura.getDescuento()) * factura.getIva();
        return TotalAPagar;

    }
}
